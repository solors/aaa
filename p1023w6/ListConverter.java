package p1023w6;

import android.text.TextUtils;
import androidx.room.TypeConverter;
import java.util.Arrays;
import java.util.List;

/* renamed from: w6.a */
/* loaded from: classes5.dex */
public class ListConverter {
    @TypeConverter
    /* renamed from: a */
    public static String m2354a(List<String> list) {
        if (list != null && list.size() != 0) {
            StringBuilder sb2 = new StringBuilder();
            for (String str : list) {
                sb2.append(str);
                sb2.append(",");
            }
            sb2.deleteCharAt(sb2.length() - 1);
            return sb2.toString();
        }
        return null;
    }

    @TypeConverter
    /* renamed from: b */
    public static List<String> m2353b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return Arrays.asList(str.split(","));
    }
}
