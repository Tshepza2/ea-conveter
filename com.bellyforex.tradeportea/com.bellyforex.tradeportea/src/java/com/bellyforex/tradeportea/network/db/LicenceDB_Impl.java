package com.bellyforex.tradeportea.network.db;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomOpenHelper;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
public final class LicenceDB_Impl extends LicenceDB {
    private volatile LicenceDao _licenceDao;

    protected SupportSQLiteOpenHelper createOpenHelper(final DatabaseConfiguration config) {
        return config.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(config.context).name(config.name).callback(new RoomOpenHelper(config, new RoomOpenHelper.Delegate(4) { // from class: com.bellyforex.tradeportea.network.db.LicenceDB_Impl.1
            public void onPostMigrate(final SupportSQLiteDatabase db) {
            }

            public void createAllTables(final SupportSQLiteDatabase db) {
                db.execSQL("CREATE TABLE IF NOT EXISTS `licences` (`ea_name` TEXT NOT NULL, `ea_notification` TEXT NOT NULL, `expires` TEXT NOT NULL, `key` TEXT NOT NULL, `owner` TEXT NOT NULL, `phone_secret_key` TEXT NOT NULL, `status` TEXT NOT NULL, `user` TEXT NOT NULL, `selected` INTEGER NOT NULL, PRIMARY KEY(`phone_secret_key`))");
                db.execSQL("CREATE TABLE IF NOT EXISTS `sicences` (`ea_name` TEXT NOT NULL, `ea_notification` TEXT NOT NULL, `expires` TEXT NOT NULL, `key` TEXT NOT NULL, `owner` TEXT NOT NULL, `phone_secret_key` TEXT NOT NULL, `status` TEXT NOT NULL, `user` TEXT NOT NULL, `selected` INTEGER NOT NULL, PRIMARY KEY(`selected`))");
                db.execSQL("CREATE TABLE IF NOT EXISTS `symbols` (`id` INTEGER NOT NULL, `name` TEXT NOT NULL, `phone_secret` TEXT, `lotSize` REAL, `action` TEXT, `platform` TEXT, PRIMARY KEY(`id`))");
                db.execSQL("CREATE TABLE IF NOT EXISTS `signals` (`id` INTEGER NOT NULL, `action` TEXT NOT NULL, `asset` TEXT NOT NULL, `latestupdate` TEXT NOT NULL, `price` TEXT NOT NULL, `sl` TEXT NOT NULL, `time` TEXT NOT NULL, `tp` TEXT NOT NULL, `lotSize` REAL, `platform` TEXT, `used` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                db.execSQL("CREATE TABLE IF NOT EXISTS `log` (`id` INTEGER NOT NULL, `message` TEXT NOT NULL, PRIMARY KEY(`id`))");
                db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '36608891260bf4fafcfeea95e7a634a9')");
            }

            public void dropAllTables(final SupportSQLiteDatabase db) {
                db.execSQL("DROP TABLE IF EXISTS `licences`");
                db.execSQL("DROP TABLE IF EXISTS `sicences`");
                db.execSQL("DROP TABLE IF EXISTS `symbols`");
                db.execSQL("DROP TABLE IF EXISTS `signals`");
                db.execSQL("DROP TABLE IF EXISTS `log`");
                List<RoomDatabase.Callback> list = LicenceDB_Impl.this.mCallbacks;
                if (list != null) {
                    for (RoomDatabase.Callback callback : list) {
                        callback.onDestructiveMigration(db);
                    }
                }
            }

            public void onCreate(final SupportSQLiteDatabase db) {
                List<RoomDatabase.Callback> list = LicenceDB_Impl.this.mCallbacks;
                if (list != null) {
                    for (RoomDatabase.Callback callback : list) {
                        callback.onCreate(db);
                    }
                }
            }

            public void onOpen(final SupportSQLiteDatabase db) {
                LicenceDB_Impl.this.mDatabase = db;
                LicenceDB_Impl.this.internalInitInvalidationTracker(db);
                List<RoomDatabase.Callback> list = LicenceDB_Impl.this.mCallbacks;
                if (list != null) {
                    for (RoomDatabase.Callback callback : list) {
                        callback.onOpen(db);
                    }
                }
            }

            public void onPreMigrate(final SupportSQLiteDatabase db) {
                DBUtil.dropFtsSyncTriggers(db);
            }

            public RoomOpenHelper.ValidationResult onValidateSchema(final SupportSQLiteDatabase db) {
                HashMap hashMap = new HashMap(9);
                hashMap.put("ea_name", new TableInfo.Column("ea_name", "TEXT", true, 0, (String) null, 1));
                hashMap.put("ea_notification", new TableInfo.Column("ea_notification", "TEXT", true, 0, (String) null, 1));
                hashMap.put("expires", new TableInfo.Column("expires", "TEXT", true, 0, (String) null, 1));
                hashMap.put("key", new TableInfo.Column("key", "TEXT", true, 0, (String) null, 1));
                hashMap.put("owner", new TableInfo.Column("owner", "TEXT", true, 0, (String) null, 1));
                hashMap.put("phone_secret_key", new TableInfo.Column("phone_secret_key", "TEXT", true, 1, (String) null, 1));
                hashMap.put("status", new TableInfo.Column("status", "TEXT", true, 0, (String) null, 1));
                hashMap.put("user", new TableInfo.Column("user", "TEXT", true, 0, (String) null, 1));
                hashMap.put("selected", new TableInfo.Column("selected", "INTEGER", true, 0, (String) null, 1));
                TableInfo tableInfo = new TableInfo("licences", hashMap, new HashSet(0), new HashSet(0));
                TableInfo read = TableInfo.read(db, "licences");
                if (!tableInfo.equals(read)) {
                    return new RoomOpenHelper.ValidationResult(false, "licences(com.bellyforex.tradeportea.network.module.Licence).\n Expected:\n" + tableInfo + "\n Found:\n" + read);
                }
                HashMap hashMap2 = new HashMap(9);
                hashMap2.put("ea_name", new TableInfo.Column("ea_name", "TEXT", true, 0, (String) null, 1));
                hashMap2.put("ea_notification", new TableInfo.Column("ea_notification", "TEXT", true, 0, (String) null, 1));
                hashMap2.put("expires", new TableInfo.Column("expires", "TEXT", true, 0, (String) null, 1));
                hashMap2.put("key", new TableInfo.Column("key", "TEXT", true, 0, (String) null, 1));
                hashMap2.put("owner", new TableInfo.Column("owner", "TEXT", true, 0, (String) null, 1));
                hashMap2.put("phone_secret_key", new TableInfo.Column("phone_secret_key", "TEXT", true, 0, (String) null, 1));
                hashMap2.put("status", new TableInfo.Column("status", "TEXT", true, 0, (String) null, 1));
                hashMap2.put("user", new TableInfo.Column("user", "TEXT", true, 0, (String) null, 1));
                hashMap2.put("selected", new TableInfo.Column("selected", "INTEGER", true, 1, (String) null, 1));
                TableInfo tableInfo2 = new TableInfo("sicences", hashMap2, new HashSet(0), new HashSet(0));
                TableInfo read2 = TableInfo.read(db, "sicences");
                if (!tableInfo2.equals(read2)) {
                    return new RoomOpenHelper.ValidationResult(false, "sicences(com.bellyforex.tradeportea.network.module.Sicence).\n Expected:\n" + tableInfo2 + "\n Found:\n" + read2);
                }
                HashMap hashMap3 = new HashMap(6);
                hashMap3.put("id", new TableInfo.Column("id", "INTEGER", true, 1, (String) null, 1));
                hashMap3.put("name", new TableInfo.Column("name", "TEXT", true, 0, (String) null, 1));
                hashMap3.put("phone_secret", new TableInfo.Column("phone_secret", "TEXT", false, 0, (String) null, 1));
                hashMap3.put("lotSize", new TableInfo.Column("lotSize", "REAL", false, 0, (String) null, 1));
                hashMap3.put("action", new TableInfo.Column("action", "TEXT", false, 0, (String) null, 1));
                hashMap3.put("platform", new TableInfo.Column("platform", "TEXT", false, 0, (String) null, 1));
                TableInfo tableInfo3 = new TableInfo("symbols", hashMap3, new HashSet(0), new HashSet(0));
                TableInfo read3 = TableInfo.read(db, "symbols");
                if (!tableInfo3.equals(read3)) {
                    return new RoomOpenHelper.ValidationResult(false, "symbols(com.bellyforex.tradeportea.network.module.Symbol).\n Expected:\n" + tableInfo3 + "\n Found:\n" + read3);
                }
                HashMap hashMap4 = new HashMap(11);
                hashMap4.put("id", new TableInfo.Column("id", "INTEGER", true, 1, (String) null, 1));
                hashMap4.put("action", new TableInfo.Column("action", "TEXT", true, 0, (String) null, 1));
                hashMap4.put("asset", new TableInfo.Column("asset", "TEXT", true, 0, (String) null, 1));
                hashMap4.put("latestupdate", new TableInfo.Column("latestupdate", "TEXT", true, 0, (String) null, 1));
                hashMap4.put("price", new TableInfo.Column("price", "TEXT", true, 0, (String) null, 1));
                hashMap4.put("sl", new TableInfo.Column("sl", "TEXT", true, 0, (String) null, 1));
                hashMap4.put("time", new TableInfo.Column("time", "TEXT", true, 0, (String) null, 1));
                hashMap4.put("tp", new TableInfo.Column("tp", "TEXT", true, 0, (String) null, 1));
                hashMap4.put("lotSize", new TableInfo.Column("lotSize", "REAL", false, 0, (String) null, 1));
                hashMap4.put("platform", new TableInfo.Column("platform", "TEXT", false, 0, (String) null, 1));
                hashMap4.put("used", new TableInfo.Column("used", "INTEGER", true, 0, (String) null, 1));
                TableInfo tableInfo4 = new TableInfo("signals", hashMap4, new HashSet(0), new HashSet(0));
                TableInfo read4 = TableInfo.read(db, "signals");
                if (!tableInfo4.equals(read4)) {
                    return new RoomOpenHelper.ValidationResult(false, "signals(com.bellyforex.tradeportea.network.module.Signal).\n Expected:\n" + tableInfo4 + "\n Found:\n" + read4);
                }
                HashMap hashMap5 = new HashMap(2);
                hashMap5.put("id", new TableInfo.Column("id", "INTEGER", true, 1, (String) null, 1));
                hashMap5.put("message", new TableInfo.Column("message", "TEXT", true, 0, (String) null, 1));
                TableInfo tableInfo5 = new TableInfo("log", hashMap5, new HashSet(0), new HashSet(0));
                TableInfo read5 = TableInfo.read(db, "log");
                if (!tableInfo5.equals(read5)) {
                    return new RoomOpenHelper.ValidationResult(false, "log(com.bellyforex.tradeportea.network.module.log).\n Expected:\n" + tableInfo5 + "\n Found:\n" + read5);
                }
                return new RoomOpenHelper.ValidationResult(true, (String) null);
            }
        }, "36608891260bf4fafcfeea95e7a634a9", "ba60343ee5806f3b3428197bc5b65f82")).build());
    }

    protected InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), new String[]{"licences", "sicences", "symbols", "signals", "log"});
    }

    public void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `licences`");
            writableDatabase.execSQL("DELETE FROM `sicences`");
            writableDatabase.execSQL("DELETE FROM `symbols`");
            writableDatabase.execSQL("DELETE FROM `signals`");
            writableDatabase.execSQL("DELETE FROM `log`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            writableDatabase.query("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.inTransaction()) {
                writableDatabase.execSQL("VACUUM");
            }
        }
    }

    protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(LicenceDao.class, LicenceDao_Impl.getRequiredConverters());
        return hashMap;
    }

    public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    public List<Migration> getAutoMigrations(final Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs) {
        return new ArrayList();
    }

    @Override // com.bellyforex.tradeportea.network.db.LicenceDB
    public LicenceDao getLicenceDao() {
        LicenceDao licenceDao;
        if (this._licenceDao != null) {
            return this._licenceDao;
        }
        synchronized (this) {
            if (this._licenceDao == null) {
                this._licenceDao = new LicenceDao_Impl(this);
            }
            licenceDao = this._licenceDao;
        }
        return licenceDao;
    }
}
