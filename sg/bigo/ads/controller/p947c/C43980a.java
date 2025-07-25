package sg.bigo.ads.controller.p947c;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import sg.bigo.ads.api.core.InterfaceC43550c;
import sg.bigo.ads.api.core.InterfaceC43564h;
import sg.bigo.ads.api.p903a.InterfaceC43528l;
import sg.bigo.ads.common.p914g.p915a.C43666a;
import sg.bigo.ads.common.utils.C43840t;

/* renamed from: sg.bigo.ads.controller.c.a */
/* loaded from: classes10.dex */
public final class C43980a {
    @Nullable
    /* renamed from: a */
    public static InterfaceC43550c m4407a(@NonNull InterfaceC43528l interfaceC43528l, InterfaceC43564h interfaceC43564h) {
        String[] strArr = {"slot"};
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i <= 0; i++) {
            sb2.append(strArr[0]);
            sb2.append("=? ");
        }
        Cursor m5240a = C43666a.m5240a("tb_addata", sb2.toString(), new String[]{String.valueOf(interfaceC43528l.mo4427l())}, null, 1);
        if (m5240a != null) {
            if (m5240a.moveToNext()) {
                long j = m5240a.getLong(m5240a.getColumnIndex("log_id"));
                String string = m5240a.getString(m5240a.getColumnIndex("ad_data"));
                long j2 = m5240a.getLong(m5240a.getColumnIndex(SDKConstants.PARAM_TOURNAMENTS_END_TIME));
                C43981b m4376a = C43981b.m4376a(j, interfaceC43564h, interfaceC43528l, string);
                if (m4376a != null) {
                    m4376a.mo4364ag();
                    m4376a.mo4377a(j2);
                    return m4376a;
                }
            }
            m5240a.close();
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m4408a(@NonNull String str) {
        int m5237b = C43666a.m5237b("tb_addata", "slot = '" + str + "'", null);
        C43840t.m4813a();
        return m5237b > 0;
    }
}
