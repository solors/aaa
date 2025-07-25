package p842q4;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "dynamic_property")
/* renamed from: q4.c */
/* loaded from: classes6.dex */
public class PublicPropertiesEntity {
    @PrimaryKey

    /* renamed from: a */
    long f103427a;
    @ColumnInfo

    /* renamed from: b */
    String f103428b;
    @ColumnInfo

    /* renamed from: c */
    long f103429c;

    public PublicPropertiesEntity(long j, String str, long j2) {
        this.f103427a = j;
        this.f103428b = str;
        this.f103429c = j2;
    }

    /* renamed from: a */
    public long m12982a() {
        return this.f103427a;
    }

    /* renamed from: b */
    public String m12981b() {
        return this.f103428b;
    }

    /* renamed from: c */
    public long m12980c() {
        return this.f103429c;
    }

    @NonNull
    public String toString() {
        return "commitId = " + this.f103427a + "\nkey = " + this.f103428b;
    }
}
