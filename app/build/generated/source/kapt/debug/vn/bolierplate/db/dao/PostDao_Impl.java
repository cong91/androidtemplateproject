package vn.bolierplate.db.dao;

import android.arch.lifecycle.ComputableLiveData;
import android.arch.lifecycle.LiveData;
import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.InvalidationTracker.Observer;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.database.Cursor;
import android.support.annotation.NonNull;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import vn.bolierplate.db.entities.Post;

@SuppressWarnings("unchecked")
public class PostDao_Impl implements PostDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfPost;

  public PostDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfPost = new EntityInsertionAdapter<Post>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `Post`(`userId`,`id`,`title`,`body`) VALUES (?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Post value) {
        stmt.bindLong(1, value.getUserId());
        stmt.bindLong(2, value.getId());
        if (value.getTitle() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTitle());
        }
        if (value.getBody() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getBody());
        }
      }
    };
  }

  @Override
  public void insertAll(List<Post> posts) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfPost.insert(posts);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<List<Post>> getAllPosts() {
    final String _sql = "SELECT * FROM post";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return new ComputableLiveData<List<Post>>() {
      private Observer _observer;

      @Override
      protected List<Post> compute() {
        if (_observer == null) {
          _observer = new Observer("post") {
            @Override
            public void onInvalidated(@NonNull Set<String> tables) {
              invalidate();
            }
          };
          __db.getInvalidationTracker().addWeakObserver(_observer);
        }
        final Cursor _cursor = __db.query(_statement);
        try {
          final int _cursorIndexOfUserId = _cursor.getColumnIndexOrThrow("userId");
          final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
          final int _cursorIndexOfTitle = _cursor.getColumnIndexOrThrow("title");
          final int _cursorIndexOfBody = _cursor.getColumnIndexOrThrow("body");
          final List<Post> _result = new ArrayList<Post>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Post _item;
            final int _tmpUserId;
            _tmpUserId = _cursor.getInt(_cursorIndexOfUserId);
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final String _tmpBody;
            _tmpBody = _cursor.getString(_cursorIndexOfBody);
            _item = new Post(_tmpUserId,_tmpId,_tmpTitle,_tmpBody);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    }.getLiveData();
  }
}
