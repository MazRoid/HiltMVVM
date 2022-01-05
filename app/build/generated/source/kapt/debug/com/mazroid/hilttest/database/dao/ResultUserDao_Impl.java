package com.mazroid.hilttest.database.dao;

import android.database.Cursor;
import androidx.room.EmptyResultSetException;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.RxRoom;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.mazroid.hilttest.database.typeconverter.DobConverter;
import com.mazroid.hilttest.database.typeconverter.LocationConverter;
import com.mazroid.hilttest.database.typeconverter.NameConverter;
import com.mazroid.hilttest.database.typeconverter.PictureConverter;
import com.mazroid.hilttest.database.typeconverter.RegisterConverter;
import com.mazroid.hilttest.ui.model.ResultUser;
import com.mazroid.hilttest.ui.model.UserLocation;
import io.reactivex.Single;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ResultUserDao_Impl implements ResultUserDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ResultUser> __insertionAdapterOfResultUser;

  private final DobConverter __dobConverter = new DobConverter();

  private final LocationConverter __locationConverter = new LocationConverter();

  private final NameConverter __nameConverter = new NameConverter();

  private final PictureConverter __pictureConverter = new PictureConverter();

  private final RegisterConverter __registerConverter = new RegisterConverter();

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public ResultUserDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfResultUser = new EntityInsertionAdapter<ResultUser>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `ResultUser` (`isAccepted`,`cell`,`dob`,`email`,`gender`,`location`,`name`,`nat`,`phone`,`picture`,`registered`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ResultUser value) {
        if (value.isAccepted() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.isAccepted());
        }
        if (value.getCell() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getCell());
        }
        final String _tmp = __dobConverter.fromValue(value.getDob());
        if (_tmp == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, _tmp);
        }
        if (value.getEmail() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getEmail());
        }
        if (value.getGender() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getGender());
        }
        final String _tmp_1 = __locationConverter.fromValue(value.getLocation());
        if (_tmp_1 == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, _tmp_1);
        }
        final String _tmp_2 = __nameConverter.fromFooter(value.getName());
        if (_tmp_2 == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, _tmp_2);
        }
        if (value.getNat() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getNat());
        }
        if (value.getPhone() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getPhone());
        }
        final String _tmp_3 = __pictureConverter.fromValue(value.getPicture());
        if (_tmp_3 == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, _tmp_3);
        }
        final String _tmp_4 = __registerConverter.fromValue(value.getRegistered());
        if (_tmp_4 == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, _tmp_4);
        }
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM ResultUser";
        return _query;
      }
    };
  }

  @Override
  public void insert(final ResultUser list) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfResultUser.insert(list);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertAll(final List<ResultUser> list) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfResultUser.insert(list);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int deleteAll() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
    __db.beginTransaction();
    try {
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAll.release(_stmt);
    }
  }

  @Override
  public Single<List<ResultUser>> getAll() {
    final String _sql = "SELECT * FROM ResultUser";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return RxRoom.createSingle(new Callable<List<ResultUser>>() {
      @Override
      public List<ResultUser> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfIsAccepted = CursorUtil.getColumnIndexOrThrow(_cursor, "isAccepted");
          final int _cursorIndexOfCell = CursorUtil.getColumnIndexOrThrow(_cursor, "cell");
          final int _cursorIndexOfDob = CursorUtil.getColumnIndexOrThrow(_cursor, "dob");
          final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "email");
          final int _cursorIndexOfGender = CursorUtil.getColumnIndexOrThrow(_cursor, "gender");
          final int _cursorIndexOfLocation = CursorUtil.getColumnIndexOrThrow(_cursor, "location");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfNat = CursorUtil.getColumnIndexOrThrow(_cursor, "nat");
          final int _cursorIndexOfPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "phone");
          final int _cursorIndexOfPicture = CursorUtil.getColumnIndexOrThrow(_cursor, "picture");
          final int _cursorIndexOfRegistered = CursorUtil.getColumnIndexOrThrow(_cursor, "registered");
          final List<ResultUser> _result = new ArrayList<ResultUser>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final ResultUser _item;
            final String _tmpIsAccepted;
            if (_cursor.isNull(_cursorIndexOfIsAccepted)) {
              _tmpIsAccepted = null;
            } else {
              _tmpIsAccepted = _cursor.getString(_cursorIndexOfIsAccepted);
            }
            final String _tmpCell;
            if (_cursor.isNull(_cursorIndexOfCell)) {
              _tmpCell = null;
            } else {
              _tmpCell = _cursor.getString(_cursorIndexOfCell);
            }
            final ResultUser.Dob _tmpDob;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfDob)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfDob);
            }
            _tmpDob = __dobConverter.toValue(_tmp);
            final String _tmpEmail;
            if (_cursor.isNull(_cursorIndexOfEmail)) {
              _tmpEmail = null;
            } else {
              _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
            }
            final String _tmpGender;
            if (_cursor.isNull(_cursorIndexOfGender)) {
              _tmpGender = null;
            } else {
              _tmpGender = _cursor.getString(_cursorIndexOfGender);
            }
            final UserLocation _tmpLocation;
            final String _tmp_1;
            if (_cursor.isNull(_cursorIndexOfLocation)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getString(_cursorIndexOfLocation);
            }
            _tmpLocation = __locationConverter.toValue(_tmp_1);
            final ResultUser.Name _tmpName;
            final String _tmp_2;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getString(_cursorIndexOfName);
            }
            _tmpName = __nameConverter.toFooter(_tmp_2);
            final String _tmpNat;
            if (_cursor.isNull(_cursorIndexOfNat)) {
              _tmpNat = null;
            } else {
              _tmpNat = _cursor.getString(_cursorIndexOfNat);
            }
            final String _tmpPhone;
            if (_cursor.isNull(_cursorIndexOfPhone)) {
              _tmpPhone = null;
            } else {
              _tmpPhone = _cursor.getString(_cursorIndexOfPhone);
            }
            final ResultUser.Picture _tmpPicture;
            final String _tmp_3;
            if (_cursor.isNull(_cursorIndexOfPicture)) {
              _tmp_3 = null;
            } else {
              _tmp_3 = _cursor.getString(_cursorIndexOfPicture);
            }
            _tmpPicture = __pictureConverter.toValue(_tmp_3);
            final ResultUser.Registered _tmpRegistered;
            final String _tmp_4;
            if (_cursor.isNull(_cursorIndexOfRegistered)) {
              _tmp_4 = null;
            } else {
              _tmp_4 = _cursor.getString(_cursorIndexOfRegistered);
            }
            _tmpRegistered = __registerConverter.toValue(_tmp_4);
            _item = new ResultUser(_tmpIsAccepted,_tmpCell,_tmpDob,_tmpEmail,_tmpGender,_tmpLocation,_tmpName,_tmpNat,_tmpPhone,_tmpPicture,_tmpRegistered);
            _result.add(_item);
          }
          if(_result == null) {
            throw new EmptyResultSetException("Query returned empty result set: " + _statement.getSql());
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
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
