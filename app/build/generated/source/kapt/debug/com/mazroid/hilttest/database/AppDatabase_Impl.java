package com.mazroid.hilttest.database;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.mazroid.hilttest.database.dao.ResultUserDao;
import com.mazroid.hilttest.database.dao.ResultUserDao_Impl;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile ResultUserDao _resultUserDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `ResultUser` (`isAccepted` TEXT NOT NULL, `cell` TEXT NOT NULL, `dob` TEXT NOT NULL, `email` TEXT NOT NULL, `gender` TEXT NOT NULL, `location` TEXT NOT NULL, `name` TEXT NOT NULL, `nat` TEXT NOT NULL, `phone` TEXT NOT NULL, `picture` TEXT NOT NULL, `registered` TEXT NOT NULL, PRIMARY KEY(`email`, `gender`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'e54893ba323ec36d1314f8493de305c3')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `ResultUser`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsResultUser = new HashMap<String, TableInfo.Column>(11);
        _columnsResultUser.put("isAccepted", new TableInfo.Column("isAccepted", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsResultUser.put("cell", new TableInfo.Column("cell", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsResultUser.put("dob", new TableInfo.Column("dob", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsResultUser.put("email", new TableInfo.Column("email", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsResultUser.put("gender", new TableInfo.Column("gender", "TEXT", true, 2, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsResultUser.put("location", new TableInfo.Column("location", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsResultUser.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsResultUser.put("nat", new TableInfo.Column("nat", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsResultUser.put("phone", new TableInfo.Column("phone", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsResultUser.put("picture", new TableInfo.Column("picture", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsResultUser.put("registered", new TableInfo.Column("registered", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysResultUser = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesResultUser = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoResultUser = new TableInfo("ResultUser", _columnsResultUser, _foreignKeysResultUser, _indicesResultUser);
        final TableInfo _existingResultUser = TableInfo.read(_db, "ResultUser");
        if (! _infoResultUser.equals(_existingResultUser)) {
          return new RoomOpenHelper.ValidationResult(false, "ResultUser(com.mazroid.hilttest.ui.model.ResultUser).\n"
                  + " Expected:\n" + _infoResultUser + "\n"
                  + " Found:\n" + _existingResultUser);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "e54893ba323ec36d1314f8493de305c3", "3510ad16c609f31fb11e5a49b01faed7");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "ResultUser");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `ResultUser`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(ResultUserDao.class, ResultUserDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public ResultUserDao resultUserDao() {
    if (_resultUserDao != null) {
      return _resultUserDao;
    } else {
      synchronized(this) {
        if(_resultUserDao == null) {
          _resultUserDao = new ResultUserDao_Impl(this);
        }
        return _resultUserDao;
      }
    }
  }
}
