Admin UI integration notes
==========================

What I changed
--------------
- Added `php-includes/api_config.php` — central place to configure the backend API base URL used by PHP admin pages. It reads `API_BASE_URL` from environment if present, otherwise defaults to `http://127.0.0.1:8000` for local dev.
- Implemented `addkey.php` which proxies the licence generation form (`key.php`) to the backend endpoint `/admin/api/licences/generate` and displays the result.
- Implemented `addea.php` which proxies the EA creation form (`EA.php`) to the backend endpoint `/admin/api/ea/create` and displays the result.
- Updated `EA.php` to fetch the list of EAs from `/admin/api/ea/` and render them dynamically.

Configuration & running (local dev)
----------------------------------
1. Start the backend (recommended to run under Python 3.11):

```powershell
cd integration/backend
python -m venv .venv
.\.venv\Scripts\Activate.ps1
python -m pip install -r requirements.txt
python -m integration.backend.seed_data
python -m integration.backend.mk_bundles
uvicorn integration.backend.main:app --reload --port 8000
```

2. Ensure the web server running the PHP admin picks up `API_BASE_URL` (if backend is remote). Example (Windows IIS or Apache env var): set `API_BASE_URL` to `http://127.0.0.1:8000`.

Notes & next steps
------------------
- The current backend prototype includes endpoints for licence generation, EA create/upload/list, signals ingest, and EA download (dev bundles). For production we should add authentication on admin endpoints and CSRF protection on the PHP forms.
- Next I can add endpoints for listing licences per EA (so `EA.php` can show active user counts), implement revocation, and add basic admin auth tokens for API calls.
