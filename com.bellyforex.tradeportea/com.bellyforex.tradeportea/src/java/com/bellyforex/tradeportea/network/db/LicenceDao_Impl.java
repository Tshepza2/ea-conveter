package com.bellyforex.tradeportea.network.db;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.bellyforex.tradeportea.network.module.Licence;
import com.bellyforex.tradeportea.network.module.Sicence;
import com.bellyforex.tradeportea.network.module.Signal;
import com.bellyforex.tradeportea.network.module.Symbol;
import com.bellyforex.tradeportea.network.module.log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
public final class LicenceDao_Impl implements LicenceDao {
    private final RoomDatabase __db;
    private final EntityDeletionOrUpdateAdapter<Licence> __deletionAdapterOfLicence;
    private final EntityDeletionOrUpdateAdapter<Sicence> __deletionAdapterOfSicence;
    private final EntityDeletionOrUpdateAdapter<Symbol> __deletionAdapterOfSymbol;
    private final EntityInsertionAdapter<Licence> __insertionAdapterOfLicence;
    private final EntityInsertionAdapter<Sicence> __insertionAdapterOfSicence;
    private final EntityInsertionAdapter<Signal> __insertionAdapterOfSignal;
    private final EntityInsertionAdapter<Signal> __insertionAdapterOfSignal_1;
    private final EntityInsertionAdapter<Symbol> __insertionAdapterOfSymbol;
    private final EntityInsertionAdapter<log> __insertionAdapterOflog;
    private final OwnerTypeConverter __ownerTypeConverter = new OwnerTypeConverter();
    private final SharedSQLiteStatement __preparedStmtOfDeleteAllSymbol;
    private final SharedSQLiteStatement __preparedStmtOfDeleteLogs;
    private final SharedSQLiteStatement __preparedStmtOfDeleteSignals;

    public LicenceDao_Impl(final RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfLicence = new EntityInsertionAdapter<Licence>(__db) { // from class: com.bellyforex.tradeportea.network.db.LicenceDao_Impl.1
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `licences` (`ea_name`,`ea_notification`,`expires`,`key`,`owner`,`phone_secret_key`,`status`,`user`,`selected`) VALUES (?,?,?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            public void bind(final SupportSQLiteStatement statement, final Licence entity) {
                if (entity.getEa_name() == null) {
                    statement.bindNull(1);
                } else {
                    statement.bindString(1, entity.getEa_name());
                }
                if (entity.getEa_notification() == null) {
                    statement.bindNull(2);
                } else {
                    statement.bindString(2, entity.getEa_notification());
                }
                if (entity.getExpires() == null) {
                    statement.bindNull(3);
                } else {
                    statement.bindString(3, entity.getExpires());
                }
                if (entity.getKey() == null) {
                    statement.bindNull(4);
                } else {
                    statement.bindString(4, entity.getKey());
                }
                String fromOwner = LicenceDao_Impl.this.__ownerTypeConverter.fromOwner(entity.getOwner());
                if (fromOwner == null) {
                    statement.bindNull(5);
                } else {
                    statement.bindString(5, fromOwner);
                }
                if (entity.getPhone_secret_key() == null) {
                    statement.bindNull(6);
                } else {
                    statement.bindString(6, entity.getPhone_secret_key());
                }
                if (entity.getStatus() == null) {
                    statement.bindNull(7);
                } else {
                    statement.bindString(7, entity.getStatus());
                }
                if (entity.getUser() == null) {
                    statement.bindNull(8);
                } else {
                    statement.bindString(8, entity.getUser());
                }
                statement.bindLong(9, entity.getSelected() ? 1L : 0L);
            }
        };
        this.__insertionAdapterOfSicence = new EntityInsertionAdapter<Sicence>(__db) { // from class: com.bellyforex.tradeportea.network.db.LicenceDao_Impl.2
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `sicences` (`ea_name`,`ea_notification`,`expires`,`key`,`owner`,`phone_secret_key`,`status`,`user`,`selected`) VALUES (?,?,?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            public void bind(final SupportSQLiteStatement statement, final Sicence entity) {
                if (entity.getEa_name() == null) {
                    statement.bindNull(1);
                } else {
                    statement.bindString(1, entity.getEa_name());
                }
                if (entity.getEa_notification() == null) {
                    statement.bindNull(2);
                } else {
                    statement.bindString(2, entity.getEa_notification());
                }
                if (entity.getExpires() == null) {
                    statement.bindNull(3);
                } else {
                    statement.bindString(3, entity.getExpires());
                }
                if (entity.getKey() == null) {
                    statement.bindNull(4);
                } else {
                    statement.bindString(4, entity.getKey());
                }
                String fromOwner = LicenceDao_Impl.this.__ownerTypeConverter.fromOwner(entity.getOwner());
                if (fromOwner == null) {
                    statement.bindNull(5);
                } else {
                    statement.bindString(5, fromOwner);
                }
                if (entity.getPhone_secret_key() == null) {
                    statement.bindNull(6);
                } else {
                    statement.bindString(6, entity.getPhone_secret_key());
                }
                if (entity.getStatus() == null) {
                    statement.bindNull(7);
                } else {
                    statement.bindString(7, entity.getStatus());
                }
                if (entity.getUser() == null) {
                    statement.bindNull(8);
                } else {
                    statement.bindString(8, entity.getUser());
                }
                statement.bindLong(9, entity.getSelected() ? 1L : 0L);
            }
        };
        this.__insertionAdapterOfSymbol = new EntityInsertionAdapter<Symbol>(__db) { // from class: com.bellyforex.tradeportea.network.db.LicenceDao_Impl.3
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `symbols` (`id`,`name`,`phone_secret`,`lotSize`,`action`,`platform`) VALUES (?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            public void bind(final SupportSQLiteStatement statement, final Symbol entity) {
                statement.bindLong(1, entity.getId());
                if (entity.getName() == null) {
                    statement.bindNull(2);
                } else {
                    statement.bindString(2, entity.getName());
                }
                if (entity.getPhone_secret() == null) {
                    statement.bindNull(3);
                } else {
                    statement.bindString(3, entity.getPhone_secret());
                }
                if (entity.getLotSize() == null) {
                    statement.bindNull(4);
                } else {
                    statement.bindDouble(4, entity.getLotSize().doubleValue());
                }
                if (entity.getAction() == null) {
                    statement.bindNull(5);
                } else {
                    statement.bindString(5, entity.getAction());
                }
                if (entity.getPlatform() == null) {
                    statement.bindNull(6);
                } else {
                    statement.bindString(6, entity.getPlatform());
                }
            }
        };
        this.__insertionAdapterOfSignal = new EntityInsertionAdapter<Signal>(__db) { // from class: com.bellyforex.tradeportea.network.db.LicenceDao_Impl.4
            protected String createQuery() {
                return "INSERT OR IGNORE INTO `signals` (`id`,`action`,`asset`,`latestupdate`,`price`,`sl`,`time`,`tp`,`lotSize`,`platform`,`used`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            public void bind(final SupportSQLiteStatement statement, final Signal entity) {
                statement.bindLong(1, entity.getId());
                if (entity.getAction() == null) {
                    statement.bindNull(2);
                } else {
                    statement.bindString(2, entity.getAction());
                }
                if (entity.getAsset() == null) {
                    statement.bindNull(3);
                } else {
                    statement.bindString(3, entity.getAsset());
                }
                if (entity.getLatestupdate() == null) {
                    statement.bindNull(4);
                } else {
                    statement.bindString(4, entity.getLatestupdate());
                }
                if (entity.getPrice() == null) {
                    statement.bindNull(5);
                } else {
                    statement.bindString(5, entity.getPrice());
                }
                if (entity.getSl() == null) {
                    statement.bindNull(6);
                } else {
                    statement.bindString(6, entity.getSl());
                }
                if (entity.getTime() == null) {
                    statement.bindNull(7);
                } else {
                    statement.bindString(7, entity.getTime());
                }
                if (entity.getTp() == null) {
                    statement.bindNull(8);
                } else {
                    statement.bindString(8, entity.getTp());
                }
                if (entity.getLotSize() == null) {
                    statement.bindNull(9);
                } else {
                    statement.bindDouble(9, entity.getLotSize().doubleValue());
                }
                if (entity.getPlatform() == null) {
                    statement.bindNull(10);
                } else {
                    statement.bindString(10, entity.getPlatform());
                }
                statement.bindLong(11, entity.getUsed() ? 1L : 0L);
            }
        };
        this.__insertionAdapterOfSignal_1 = new EntityInsertionAdapter<Signal>(__db) { // from class: com.bellyforex.tradeportea.network.db.LicenceDao_Impl.5
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `signals` (`id`,`action`,`asset`,`latestupdate`,`price`,`sl`,`time`,`tp`,`lotSize`,`platform`,`used`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            public void bind(final SupportSQLiteStatement statement, final Signal entity) {
                statement.bindLong(1, entity.getId());
                if (entity.getAction() == null) {
                    statement.bindNull(2);
                } else {
                    statement.bindString(2, entity.getAction());
                }
                if (entity.getAsset() == null) {
                    statement.bindNull(3);
                } else {
                    statement.bindString(3, entity.getAsset());
                }
                if (entity.getLatestupdate() == null) {
                    statement.bindNull(4);
                } else {
                    statement.bindString(4, entity.getLatestupdate());
                }
                if (entity.getPrice() == null) {
                    statement.bindNull(5);
                } else {
                    statement.bindString(5, entity.getPrice());
                }
                if (entity.getSl() == null) {
                    statement.bindNull(6);
                } else {
                    statement.bindString(6, entity.getSl());
                }
                if (entity.getTime() == null) {
                    statement.bindNull(7);
                } else {
                    statement.bindString(7, entity.getTime());
                }
                if (entity.getTp() == null) {
                    statement.bindNull(8);
                } else {
                    statement.bindString(8, entity.getTp());
                }
                if (entity.getLotSize() == null) {
                    statement.bindNull(9);
                } else {
                    statement.bindDouble(9, entity.getLotSize().doubleValue());
                }
                if (entity.getPlatform() == null) {
                    statement.bindNull(10);
                } else {
                    statement.bindString(10, entity.getPlatform());
                }
                statement.bindLong(11, entity.getUsed() ? 1L : 0L);
            }
        };
        this.__insertionAdapterOflog = new EntityInsertionAdapter<log>(__db) { // from class: com.bellyforex.tradeportea.network.db.LicenceDao_Impl.6
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `log` (`id`,`message`) VALUES (?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            public void bind(final SupportSQLiteStatement statement, final log entity) {
                statement.bindLong(1, entity.getId());
                if (entity.getMessage() == null) {
                    statement.bindNull(2);
                } else {
                    statement.bindString(2, entity.getMessage());
                }
            }
        };
        this.__deletionAdapterOfLicence = new EntityDeletionOrUpdateAdapter<Licence>(__db) { // from class: com.bellyforex.tradeportea.network.db.LicenceDao_Impl.7
            protected String createQuery() {
                return "DELETE FROM `licences` WHERE `phone_secret_key` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            public void bind(final SupportSQLiteStatement statement, final Licence entity) {
                if (entity.getPhone_secret_key() == null) {
                    statement.bindNull(1);
                } else {
                    statement.bindString(1, entity.getPhone_secret_key());
                }
            }
        };
        this.__deletionAdapterOfSicence = new EntityDeletionOrUpdateAdapter<Sicence>(__db) { // from class: com.bellyforex.tradeportea.network.db.LicenceDao_Impl.8
            protected String createQuery() {
                return "DELETE FROM `sicences` WHERE `selected` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            public void bind(final SupportSQLiteStatement statement, final Sicence entity) {
                statement.bindLong(1, entity.getSelected() ? 1L : 0L);
            }
        };
        this.__deletionAdapterOfSymbol = new EntityDeletionOrUpdateAdapter<Symbol>(__db) { // from class: com.bellyforex.tradeportea.network.db.LicenceDao_Impl.9
            protected String createQuery() {
                return "DELETE FROM `symbols` WHERE `id` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            public void bind(final SupportSQLiteStatement statement, final Symbol entity) {
                statement.bindLong(1, entity.getId());
            }
        };
        this.__preparedStmtOfDeleteAllSymbol = new SharedSQLiteStatement(__db) { // from class: com.bellyforex.tradeportea.network.db.LicenceDao_Impl.10
            public String createQuery() {
                return "DELETE FROM symbols WHERE phone_secret= ?";
            }
        };
        this.__preparedStmtOfDeleteSignals = new SharedSQLiteStatement(__db) { // from class: com.bellyforex.tradeportea.network.db.LicenceDao_Impl.11
            public String createQuery() {
                return "DELETE FROM signals";
            }
        };
        this.__preparedStmtOfDeleteLogs = new SharedSQLiteStatement(__db) { // from class: com.bellyforex.tradeportea.network.db.LicenceDao_Impl.12
            public String createQuery() {
                return "DELETE FROM log";
            }
        };
    }

    @Override // com.bellyforex.tradeportea.network.db.LicenceDao
    public Object upsert(final Licence licence, final Continuation<? super Long> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Long>() { // from class: com.bellyforex.tradeportea.network.db.LicenceDao_Impl.13
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Long call() throws Exception {
                LicenceDao_Impl.this.__db.beginTransaction();
                try {
                    Long valueOf = Long.valueOf(LicenceDao_Impl.this.__insertionAdapterOfLicence.insertAndReturnId(licence));
                    LicenceDao_Impl.this.__db.setTransactionSuccessful();
                    return valueOf;
                } finally {
                    LicenceDao_Impl.this.__db.endTransaction();
                }
            }
        }, $completion);
    }

    @Override // com.bellyforex.tradeportea.network.db.LicenceDao
    public Object selectedupsert(final Sicence licence, final Continuation<? super Long> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Long>() { // from class: com.bellyforex.tradeportea.network.db.LicenceDao_Impl.14
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Long call() throws Exception {
                LicenceDao_Impl.this.__db.beginTransaction();
                try {
                    Long valueOf = Long.valueOf(LicenceDao_Impl.this.__insertionAdapterOfSicence.insertAndReturnId(licence));
                    LicenceDao_Impl.this.__db.setTransactionSuccessful();
                    return valueOf;
                } finally {
                    LicenceDao_Impl.this.__db.endTransaction();
                }
            }
        }, $completion);
    }

    @Override // com.bellyforex.tradeportea.network.db.LicenceDao
    public Object upsetSymbol(final Symbol symbol, final Continuation<? super Long> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Long>() { // from class: com.bellyforex.tradeportea.network.db.LicenceDao_Impl.15
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Long call() throws Exception {
                LicenceDao_Impl.this.__db.beginTransaction();
                try {
                    Long valueOf = Long.valueOf(LicenceDao_Impl.this.__insertionAdapterOfSymbol.insertAndReturnId(symbol));
                    LicenceDao_Impl.this.__db.setTransactionSuccessful();
                    return valueOf;
                } finally {
                    LicenceDao_Impl.this.__db.endTransaction();
                }
            }
        }, $completion);
    }

    @Override // com.bellyforex.tradeportea.network.db.LicenceDao
    public Object saveSignals(final Signal signal, final Continuation<? super Long> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Long>() { // from class: com.bellyforex.tradeportea.network.db.LicenceDao_Impl.16
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Long call() throws Exception {
                LicenceDao_Impl.this.__db.beginTransaction();
                try {
                    Long valueOf = Long.valueOf(LicenceDao_Impl.this.__insertionAdapterOfSignal.insertAndReturnId(signal));
                    LicenceDao_Impl.this.__db.setTransactionSuccessful();
                    return valueOf;
                } finally {
                    LicenceDao_Impl.this.__db.endTransaction();
                }
            }
        }, $completion);
    }

    @Override // com.bellyforex.tradeportea.network.db.LicenceDao
    public Object updateSignals(final Signal signal, final Continuation<? super Long> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Long>() { // from class: com.bellyforex.tradeportea.network.db.LicenceDao_Impl.17
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Long call() throws Exception {
                LicenceDao_Impl.this.__db.beginTransaction();
                try {
                    Long valueOf = Long.valueOf(LicenceDao_Impl.this.__insertionAdapterOfSignal_1.insertAndReturnId(signal));
                    LicenceDao_Impl.this.__db.setTransactionSuccessful();
                    return valueOf;
                } finally {
                    LicenceDao_Impl.this.__db.endTransaction();
                }
            }
        }, $completion);
    }

    @Override // com.bellyforex.tradeportea.network.db.LicenceDao
    public Object upSetLog(final log log, final Continuation<? super Long> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Long>() { // from class: com.bellyforex.tradeportea.network.db.LicenceDao_Impl.18
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Long call() throws Exception {
                LicenceDao_Impl.this.__db.beginTransaction();
                try {
                    Long valueOf = Long.valueOf(LicenceDao_Impl.this.__insertionAdapterOflog.insertAndReturnId(log));
                    LicenceDao_Impl.this.__db.setTransactionSuccessful();
                    return valueOf;
                } finally {
                    LicenceDao_Impl.this.__db.endTransaction();
                }
            }
        }, $completion);
    }

    @Override // com.bellyforex.tradeportea.network.db.LicenceDao
    public Object deleteLicence(final Licence licence, final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.bellyforex.tradeportea.network.db.LicenceDao_Impl.19
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                LicenceDao_Impl.this.__db.beginTransaction();
                try {
                    LicenceDao_Impl.this.__deletionAdapterOfLicence.handle(licence);
                    LicenceDao_Impl.this.__db.setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                    LicenceDao_Impl.this.__db.endTransaction();
                }
            }
        }, $completion);
    }

    @Override // com.bellyforex.tradeportea.network.db.LicenceDao
    public Object deleteSicence(final Sicence licence, final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.bellyforex.tradeportea.network.db.LicenceDao_Impl.20
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                LicenceDao_Impl.this.__db.beginTransaction();
                try {
                    LicenceDao_Impl.this.__deletionAdapterOfSicence.handle(licence);
                    LicenceDao_Impl.this.__db.setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                    LicenceDao_Impl.this.__db.endTransaction();
                }
            }
        }, $completion);
    }

    @Override // com.bellyforex.tradeportea.network.db.LicenceDao
    public Object deleteSymbol(final Symbol symbol, final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.bellyforex.tradeportea.network.db.LicenceDao_Impl.21
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                LicenceDao_Impl.this.__db.beginTransaction();
                try {
                    LicenceDao_Impl.this.__deletionAdapterOfSymbol.handle(symbol);
                    LicenceDao_Impl.this.__db.setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                    LicenceDao_Impl.this.__db.endTransaction();
                }
            }
        }, $completion);
    }

    @Override // com.bellyforex.tradeportea.network.db.LicenceDao
    public Object deleteAllSymbol(final String phone_secret, final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.bellyforex.tradeportea.network.db.LicenceDao_Impl.22
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                SupportSQLiteStatement acquire = LicenceDao_Impl.this.__preparedStmtOfDeleteAllSymbol.acquire();
                String str = phone_secret;
                if (str == null) {
                    acquire.bindNull(1);
                } else {
                    acquire.bindString(1, str);
                }
                try {
                    LicenceDao_Impl.this.__db.beginTransaction();
                    acquire.executeUpdateDelete();
                    LicenceDao_Impl.this.__db.setTransactionSuccessful();
                    Unit unit = Unit.INSTANCE;
                    LicenceDao_Impl.this.__db.endTransaction();
                    return unit;
                } finally {
                    LicenceDao_Impl.this.__preparedStmtOfDeleteAllSymbol.release(acquire);
                }
            }
        }, $completion);
    }

    @Override // com.bellyforex.tradeportea.network.db.LicenceDao
    public Object deleteSignals(final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.bellyforex.tradeportea.network.db.LicenceDao_Impl.23
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                SupportSQLiteStatement acquire = LicenceDao_Impl.this.__preparedStmtOfDeleteSignals.acquire();
                try {
                    LicenceDao_Impl.this.__db.beginTransaction();
                    acquire.executeUpdateDelete();
                    LicenceDao_Impl.this.__db.setTransactionSuccessful();
                    Unit unit = Unit.INSTANCE;
                    LicenceDao_Impl.this.__db.endTransaction();
                    return unit;
                } finally {
                    LicenceDao_Impl.this.__preparedStmtOfDeleteSignals.release(acquire);
                }
            }
        }, $completion);
    }

    @Override // com.bellyforex.tradeportea.network.db.LicenceDao
    public Object deleteLogs(final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.bellyforex.tradeportea.network.db.LicenceDao_Impl.24
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                SupportSQLiteStatement acquire = LicenceDao_Impl.this.__preparedStmtOfDeleteLogs.acquire();
                try {
                    LicenceDao_Impl.this.__db.beginTransaction();
                    acquire.executeUpdateDelete();
                    LicenceDao_Impl.this.__db.setTransactionSuccessful();
                    Unit unit = Unit.INSTANCE;
                    LicenceDao_Impl.this.__db.endTransaction();
                    return unit;
                } finally {
                    LicenceDao_Impl.this.__preparedStmtOfDeleteLogs.release(acquire);
                }
            }
        }, $completion);
    }

    @Override // com.bellyforex.tradeportea.network.db.LicenceDao
    public LiveData<List<Licence>> getDBLicences() {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM licences", 0);
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"licences"}, false, new Callable<List<Licence>>() { // from class: com.bellyforex.tradeportea.network.db.LicenceDao_Impl.25
            @Override // java.util.concurrent.Callable
            public List<Licence> call() throws Exception {
                Cursor query = DBUtil.query(LicenceDao_Impl.this.__db, acquire, false, (CancellationSignal) null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "ea_name");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "ea_notification");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "expires");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "key");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "owner");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "phone_secret_key");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "status");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "user");
                    int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "selected");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        arrayList.add(new Licence(query.isNull(columnIndexOrThrow) ? null : query.getString(columnIndexOrThrow), query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2), query.isNull(columnIndexOrThrow3) ? null : query.getString(columnIndexOrThrow3), query.isNull(columnIndexOrThrow4) ? null : query.getString(columnIndexOrThrow4), LicenceDao_Impl.this.__ownerTypeConverter.toOwner(query.isNull(columnIndexOrThrow5) ? null : query.getString(columnIndexOrThrow5)), query.isNull(columnIndexOrThrow6) ? null : query.getString(columnIndexOrThrow6), query.isNull(columnIndexOrThrow7) ? null : query.getString(columnIndexOrThrow7), query.isNull(columnIndexOrThrow8) ? null : query.getString(columnIndexOrThrow8), query.getInt(columnIndexOrThrow9) != 0));
                    }
                    return arrayList;
                } finally {
                    query.close();
                }
            }

            protected void finalize() {
                acquire.release();
            }
        });
    }

    @Override // com.bellyforex.tradeportea.network.db.LicenceDao
    public LiveData<List<Sicence>> getSELicences() {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM sicences", 0);
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"sicences"}, false, new Callable<List<Sicence>>() { // from class: com.bellyforex.tradeportea.network.db.LicenceDao_Impl.26
            @Override // java.util.concurrent.Callable
            public List<Sicence> call() throws Exception {
                Cursor query = DBUtil.query(LicenceDao_Impl.this.__db, acquire, false, (CancellationSignal) null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "ea_name");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "ea_notification");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "expires");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "key");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "owner");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "phone_secret_key");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "status");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "user");
                    int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "selected");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        arrayList.add(new Sicence(query.isNull(columnIndexOrThrow) ? null : query.getString(columnIndexOrThrow), query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2), query.isNull(columnIndexOrThrow3) ? null : query.getString(columnIndexOrThrow3), query.isNull(columnIndexOrThrow4) ? null : query.getString(columnIndexOrThrow4), LicenceDao_Impl.this.__ownerTypeConverter.toOwner(query.isNull(columnIndexOrThrow5) ? null : query.getString(columnIndexOrThrow5)), query.isNull(columnIndexOrThrow6) ? null : query.getString(columnIndexOrThrow6), query.isNull(columnIndexOrThrow7) ? null : query.getString(columnIndexOrThrow7), query.isNull(columnIndexOrThrow8) ? null : query.getString(columnIndexOrThrow8), query.getInt(columnIndexOrThrow9) != 0));
                    }
                    return arrayList;
                } finally {
                    query.close();
                }
            }

            protected void finalize() {
                acquire.release();
            }
        });
    }

    @Override // com.bellyforex.tradeportea.network.db.LicenceDao
    public LiveData<List<Symbol>> getSavedSymbols(final String phone_secret) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM symbols WHERE phone_secret= ?", 1);
        if (phone_secret == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, phone_secret);
        }
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"symbols"}, false, new Callable<List<Symbol>>() { // from class: com.bellyforex.tradeportea.network.db.LicenceDao_Impl.27
            @Override // java.util.concurrent.Callable
            public List<Symbol> call() throws Exception {
                Cursor query = DBUtil.query(LicenceDao_Impl.this.__db, acquire, false, (CancellationSignal) null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "name");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "phone_secret");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "lotSize");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "action");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "platform");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        arrayList.add(new Symbol(query.getInt(columnIndexOrThrow), query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2), query.isNull(columnIndexOrThrow3) ? null : query.getString(columnIndexOrThrow3), query.isNull(columnIndexOrThrow4) ? null : Double.valueOf(query.getDouble(columnIndexOrThrow4)), query.isNull(columnIndexOrThrow5) ? null : query.getString(columnIndexOrThrow5), query.isNull(columnIndexOrThrow6) ? null : query.getString(columnIndexOrThrow6)));
                    }
                    return arrayList;
                } finally {
                    query.close();
                }
            }

            protected void finalize() {
                acquire.release();
            }
        });
    }

    @Override // com.bellyforex.tradeportea.network.db.LicenceDao
    public LiveData<List<Signal>> getDBSignals() {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM signals", 0);
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"signals"}, false, new Callable<List<Signal>>() { // from class: com.bellyforex.tradeportea.network.db.LicenceDao_Impl.28
            @Override // java.util.concurrent.Callable
            public List<Signal> call() throws Exception {
                Cursor query = DBUtil.query(LicenceDao_Impl.this.__db, acquire, false, (CancellationSignal) null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "action");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "asset");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "latestupdate");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "price");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "sl");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "time");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "tp");
                    int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "lotSize");
                    int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "platform");
                    int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "used");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        arrayList.add(new Signal(query.getInt(columnIndexOrThrow), query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2), query.isNull(columnIndexOrThrow3) ? null : query.getString(columnIndexOrThrow3), query.isNull(columnIndexOrThrow4) ? null : query.getString(columnIndexOrThrow4), query.isNull(columnIndexOrThrow5) ? null : query.getString(columnIndexOrThrow5), query.isNull(columnIndexOrThrow6) ? null : query.getString(columnIndexOrThrow6), query.isNull(columnIndexOrThrow7) ? null : query.getString(columnIndexOrThrow7), query.isNull(columnIndexOrThrow8) ? null : query.getString(columnIndexOrThrow8), query.isNull(columnIndexOrThrow9) ? null : Double.valueOf(query.getDouble(columnIndexOrThrow9)), query.isNull(columnIndexOrThrow10) ? null : query.getString(columnIndexOrThrow10), query.getInt(columnIndexOrThrow11) != 0));
                    }
                    return arrayList;
                } finally {
                    query.close();
                }
            }

            protected void finalize() {
                acquire.release();
            }
        });
    }

    @Override // com.bellyforex.tradeportea.network.db.LicenceDao
    public LiveData<List<log>> getDBLogs() {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM log", 0);
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"log"}, false, new Callable<List<log>>() { // from class: com.bellyforex.tradeportea.network.db.LicenceDao_Impl.29
            @Override // java.util.concurrent.Callable
            public List<log> call() throws Exception {
                Cursor query = DBUtil.query(LicenceDao_Impl.this.__db, acquire, false, (CancellationSignal) null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "message");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        arrayList.add(new log(query.getInt(columnIndexOrThrow), query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2)));
                    }
                    return arrayList;
                } finally {
                    query.close();
                }
            }

            protected void finalize() {
                acquire.release();
            }
        });
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }
}
