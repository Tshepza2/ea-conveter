package com.bellyforex.tradeportea.network.db;

import android.content.Context;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LicenceDB.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&¨\u0006\u0006"}, d2 = {"Lcom/bellyforex/tradeportea/network/db/LicenceDB;", "Landroidx/room/RoomDatabase;", "()V", "getLicenceDao", "Lcom/bellyforex/tradeportea/network/db/LicenceDao;", "Companion", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
public abstract class LicenceDB extends RoomDatabase {
    public static final Companion Companion = new Companion(null);
    private static final Object LOCK = new Object();
    private static final Migration MIGRATION_2_3 = new Migration() { // from class: com.bellyforex.tradeportea.network.db.LicenceDB$Companion$MIGRATION_2_3$1
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "database");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS signals (id INTEGER NOT NULL, action TEXT NOT NULL,asset TEXT NOT NULL,latestupdate TEXT NOT NULL,price TEXT NOT NULL,sl TEXT NOT NULL,time TEXT NOT NULL,tp TEXT NOT NULL,lotSize DOUBLE NULL,platform TEXT NULL,used INTEGER NOT NULL,PRIMARY KEY(id))");
        }
    };
    private static final Migration MIGRATION_3_4 = new Migration() { // from class: com.bellyforex.tradeportea.network.db.LicenceDB$Companion$MIGRATION_3_4$1
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "database");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS log (id INTEGER NOT NULL, message TEXT NOT NULL,PRIMARY KEY(id))");
        }
    };
    private static volatile LicenceDB instance;

    public abstract LicenceDao getLicenceDao();

    /* compiled from: LicenceDB.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0011\u0010\f\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0086\u0002R\u000e\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/bellyforex/tradeportea/network/db/LicenceDB$Companion;", "", "()V", "LOCK", "MIGRATION_2_3", "Landroidx/room/migration/Migration;", "MIGRATION_3_4", "instance", "Lcom/bellyforex/tradeportea/network/db/LicenceDB;", "createDatabase", "context", "Landroid/content/Context;", "invoke", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final LicenceDB invoke(Context context) {
            LicenceDB licenceDB;
            Intrinsics.checkNotNullParameter(context, "context");
            LicenceDB licenceDB2 = LicenceDB.instance;
            if (licenceDB2 == null) {
                synchronized (LicenceDB.LOCK) {
                    LicenceDB licenceDB3 = LicenceDB.instance;
                    if (licenceDB3 == null) {
                        licenceDB = LicenceDB.Companion.createDatabase(context);
                        Companion companion = LicenceDB.Companion;
                        LicenceDB.instance = licenceDB;
                    } else {
                        licenceDB = licenceDB3;
                    }
                }
                return licenceDB;
            }
            return licenceDB2;
        }

        private final LicenceDB createDatabase(Context context) {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            return (LicenceDB) Room.databaseBuilder(applicationContext, LicenceDB.class, "licences_db").addMigrations(new Migration[]{LicenceDB.MIGRATION_2_3}).addMigrations(new Migration[]{LicenceDB.MIGRATION_3_4}).build();
        }
    }
}
