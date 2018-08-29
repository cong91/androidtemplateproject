package vn.framgia.boilerplate.db;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.db.SupportSQLiteOpenHelper;
import android.arch.persistence.db.SupportSQLiteOpenHelper.Callback;
import android.arch.persistence.db.SupportSQLiteOpenHelper.Configuration;
import android.arch.persistence.room.DatabaseConfiguration;
import android.arch.persistence.room.InvalidationTracker;
import android.arch.persistence.room.RoomOpenHelper;
import android.arch.persistence.room.RoomOpenHelper.Delegate;
import android.arch.persistence.room.util.TableInfo;
import android.arch.persistence.room.util.TableInfo.Column;
import android.arch.persistence.room.util.TableInfo.ForeignKey;
import android.arch.persistence.room.util.TableInfo.Index;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import vn.framgia.boilerplate.db.dao.ExampleDao;
import vn.framgia.boilerplate.db.dao.ExampleDao_Impl;
import vn.framgia.boilerplate.db.dao.PostDao;
import vn.framgia.boilerplate.db.dao.PostDao_Impl;

@SuppressWarnings("unchecked")
public class AppDatabase_Impl extends AppDatabase {
  private volatile ExampleDao _exampleDao;

  private volatile PostDao _postDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Example` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `exampleString` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Post` (`userId` INTEGER NOT NULL, `id` INTEGER NOT NULL, `title` TEXT NOT NULL, `body` TEXT NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"393b94167f65efb57c44efadbee25c26\")");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `Example`");
        _db.execSQL("DROP TABLE IF EXISTS `Post`");
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
      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsExample = new HashMap<String, TableInfo.Column>(2);
        _columnsExample.put("id", new TableInfo.Column("id", "INTEGER", true, 1));
        _columnsExample.put("exampleString", new TableInfo.Column("exampleString", "TEXT", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysExample = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesExample = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoExample = new TableInfo("Example", _columnsExample, _foreignKeysExample, _indicesExample);
        final TableInfo _existingExample = TableInfo.read(_db, "Example");
        if (! _infoExample.equals(_existingExample)) {
          throw new IllegalStateException("Migration didn't properly handle Example(vn.framgia.boilerplate.db.entities.Example).\n"
                  + " Expected:\n" + _infoExample + "\n"
                  + " Found:\n" + _existingExample);
        }
        final HashMap<String, TableInfo.Column> _columnsPost = new HashMap<String, TableInfo.Column>(4);
        _columnsPost.put("userId", new TableInfo.Column("userId", "INTEGER", true, 0));
        _columnsPost.put("id", new TableInfo.Column("id", "INTEGER", true, 1));
        _columnsPost.put("title", new TableInfo.Column("title", "TEXT", true, 0));
        _columnsPost.put("body", new TableInfo.Column("body", "TEXT", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysPost = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesPost = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoPost = new TableInfo("Post", _columnsPost, _foreignKeysPost, _indicesPost);
        final TableInfo _existingPost = TableInfo.read(_db, "Post");
        if (! _infoPost.equals(_existingPost)) {
          throw new IllegalStateException("Migration didn't properly handle Post(vn.framgia.boilerplate.db.entities.Post).\n"
                  + " Expected:\n" + _infoPost + "\n"
                  + " Found:\n" + _existingPost);
        }
      }
    }, "393b94167f65efb57c44efadbee25c26", "6abf815ca28556049be8fa9c483f75a4");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    return new InvalidationTracker(this, "Example","Post");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `Example`");
      _db.execSQL("DELETE FROM `Post`");
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
  public ExampleDao exampleDao() {
    if (_exampleDao != null) {
      return _exampleDao;
    } else {
      synchronized(this) {
        if(_exampleDao == null) {
          _exampleDao = new ExampleDao_Impl(this);
        }
        return _exampleDao;
      }
    }
  }

  @Override
  public PostDao postDao() {
    if (_postDao != null) {
      return _postDao;
    } else {
      synchronized(this) {
        if(_postDao == null) {
          _postDao = new PostDao_Impl(this);
        }
        return _postDao;
      }
    }
  }
}
