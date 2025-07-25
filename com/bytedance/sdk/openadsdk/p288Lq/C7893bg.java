package com.bytedance.sdk.openadsdk.p288Lq;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.C7741PX;
import com.bytedance.sdk.openadsdk.ldr.C9305bg;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.Lq.bg */
/* loaded from: classes3.dex */
public class C7893bg implements Comparable<C7893bg> {

    /* renamed from: IL */
    private final String f17227IL;

    /* renamed from: bX */
    private int f17234bX;

    /* renamed from: iR */
    private int f17237iR;
    private long yDt;

    /* renamed from: zx */
    private int f17238zx;

    /* renamed from: bg */
    private final ArrayList<Long> f17235bg = new ArrayList<>();
    private final ArrayList<Long> eqN = new ArrayList<>();
    private final ArrayList<Long> ldr = new ArrayList<>();

    /* renamed from: Kg */
    private final ArrayList<Long> f17228Kg = new ArrayList<>();

    /* renamed from: WR */
    private final HashMap<String, C7891IL> f17233WR = new HashMap<>();

    /* renamed from: eo */
    private int f17236eo = 0;

    /* renamed from: VB */
    private int f17232VB = 0;

    /* renamed from: PX */
    private final HashMap<String, C7891IL> f17230PX = new HashMap<>();

    /* renamed from: Ta */
    private int f17231Ta = 0;

    /* renamed from: Lq */
    private final ArrayList<String> f17229Lq = new ArrayList<>();

    public C7893bg(String str) {
        this.f17227IL = str;
    }

    /* renamed from: IL */
    private void m87453IL(@NonNull JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        int i;
        int i2;
        int i3;
        long j;
        HashSet hashSet;
        HashSet hashSet2;
        HashSet hashSet3;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        int[] m83113PX = C9305bg.m83103bg().m83113PX();
        long j2 = 60000;
        if (m83113PX != null) {
            int i4 = 0;
            while (i4 < m83113PX.length) {
                int i5 = m83113PX[i4];
                long j3 = elapsedRealtime - (i5 * j2);
                Iterator<String> it = this.f17230PX.keySet().iterator();
                long j4 = 0;
                while (it.hasNext()) {
                    String next = it.next();
                    Iterator<String> it2 = it;
                    C7891IL c7891il = this.f17230PX.get(next);
                    if (c7891il != null) {
                        long m87457bg = c7891il.m87457bg(j3, elapsedRealtime);
                        j4 += m87457bg;
                        if (m87457bg <= 0 && i4 == m83113PX.length - 1) {
                            hashSet4.add(next);
                        }
                    }
                    it = it2;
                }
                if (j4 != 0) {
                    jSONObject.put("lp_stay_t_".concat(String.valueOf(i5)), j4);
                    hashSet2 = hashSet4;
                    hashSet3 = hashSet5;
                    long optInt = jSONObject2.optInt("lp_stay_t_".concat(String.valueOf(i5))) + j4;
                    if (optInt != 0) {
                        jSONObject2.put("lp_stay_t_".concat(String.valueOf(i5)), optInt);
                    }
                } else {
                    hashSet2 = hashSet4;
                    hashSet3 = hashSet5;
                }
                i4++;
                hashSet4 = hashSet2;
                hashSet5 = hashSet3;
                j2 = 60000;
            }
        }
        HashSet hashSet6 = hashSet4;
        HashSet hashSet7 = hashSet5;
        int[] m83112Ta = C9305bg.m83103bg().m83112Ta();
        if (m83112Ta != null) {
            int i6 = 0;
            while (i6 < m83112Ta.length) {
                int i7 = m83112Ta[i6];
                long j5 = elapsedRealtime - (i7 * 60000);
                Iterator<String> it3 = this.f17233WR.keySet().iterator();
                int i8 = 0;
                long j6 = 0;
                while (it3.hasNext()) {
                    String next2 = it3.next();
                    Iterator<String> it4 = it3;
                    C7891IL c7891il2 = this.f17233WR.get(next2);
                    if (c7891il2 != null) {
                        long m87457bg2 = c7891il2.m87457bg(j5, elapsedRealtime);
                        j6 += m87457bg2;
                        if (m87457bg2 > 20000) {
                            i8++;
                        }
                        if (m87457bg2 <= 0 && i6 == m83112Ta.length - 1) {
                            hashSet = hashSet7;
                            hashSet.add(next2);
                            hashSet7 = hashSet;
                            it3 = it4;
                        }
                    }
                    hashSet = hashSet7;
                    hashSet7 = hashSet;
                    it3 = it4;
                }
                HashSet hashSet8 = hashSet7;
                if (j6 != 0) {
                    jSONObject.put("v_stay_t_".concat(String.valueOf(i7)), j6);
                    j = elapsedRealtime;
                    long optInt2 = jSONObject2.optInt("v_stay_t_".concat(String.valueOf(i7))) + j6;
                    if (optInt2 != 0) {
                        jSONObject2.put("v_stay_t_".concat(String.valueOf(i7)), optInt2);
                    }
                } else {
                    j = elapsedRealtime;
                }
                if (i8 != 0) {
                    jSONObject.put("v_20s_play_c_".concat(String.valueOf(i7)), i8);
                    int optInt3 = jSONObject2.optInt("v_20s_play_c_".concat(String.valueOf(i7))) + i8;
                    if (optInt3 != 0) {
                        jSONObject2.put("v_20s_play_c_".concat(String.valueOf(i7)), optInt3);
                    }
                }
                i6++;
                hashSet7 = hashSet8;
                elapsedRealtime = j;
            }
        }
        HashSet hashSet9 = hashSet7;
        if (!hashSet6.isEmpty()) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                this.f17230PX.remove((String) it5.next());
            }
        }
        if (!hashSet9.isEmpty()) {
            Iterator it6 = hashSet9.iterator();
            while (it6.hasNext()) {
                this.f17233WR.remove((String) it6.next());
            }
        }
        if (C9305bg.m83103bg().m83114Lq() && (i3 = this.f17236eo) != 0) {
            jSONObject.put("v_stay_t_s", i3);
            int optInt4 = jSONObject2.optInt("v_stay_t_s") + this.f17236eo;
            if (optInt4 != 0) {
                jSONObject2.put("v_stay_t_s", optInt4);
            }
        }
        if (C9305bg.m83103bg().yDt() && (i2 = this.f17231Ta) != 0) {
            jSONObject.put("lp_stay_t_s", i2);
            int optInt5 = jSONObject2.optInt("lp_stay_t_s") + this.f17231Ta;
            if (optInt5 != 0) {
                jSONObject2.put("lp_stay_t_s", optInt5);
            }
        }
        if (!C9305bg.m83103bg().xxp() || (i = this.f17232VB) == 0) {
            return;
        }
        jSONObject.put("v_30p_play_c_s", i);
        int optInt6 = jSONObject2.optInt("v_30p_play_c_s") + this.f17232VB;
        if (optInt6 != 0) {
            jSONObject2.put("v_30p_play_c_s", optInt6);
        }
    }

    /* renamed from: bg */
    public void m87450bg(@NonNull String str, @Nullable String str2) {
        C7891IL c7891il;
        C7891IL c7891il2;
        C7891IL c7891il3;
        C7891IL c7891il4;
        C7891IL c7891il5;
        C7891IL c7891il6;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1908685858:
                if (str.equals("landingContinue")) {
                    c = 0;
                    break;
                }
                break;
            case -1769688545:
                if (str.equals("landingPause")) {
                    c = 1;
                    break;
                }
                break;
            case -1766371189:
                if (str.equals("landingStart")) {
                    c = 2;
                    break;
                }
                break;
            case -1643912491:
                if (str.equals("feed_over")) {
                    c = 3;
                    break;
                }
                break;
            case -1643892427:
                if (str.equals("feed_play")) {
                    c = 4;
                    break;
                }
                break;
            case 3529469:
                if (str.equals("show")) {
                    c = 5;
                    break;
                }
                break;
            case 94750088:
                if (str.equals("click")) {
                    c = 6;
                    break;
                }
                break;
            case 533457448:
                if (str.equals("feed_continue")) {
                    c = 7;
                    break;
                }
                break;
            case 566194974:
                if (str.equals("feed_break")) {
                    c = '\b';
                    break;
                }
                break;
            case 578633749:
                if (str.equals("feed_pause")) {
                    c = '\t';
                    break;
                }
                break;
            case 695109002:
                if (str.equals("landingFinish")) {
                    c = '\n';
                    break;
                }
                break;
            case 702698279:
                if (str.equals("videoPercent30")) {
                    c = 11;
                    break;
                }
                break;
            case 1338624943:
                if (str.equals("videoForceBreak")) {
                    c = '\f';
                    break;
                }
                break;
            case 1671642405:
                if (str.equals("dislike")) {
                    c = '\r';
                    break;
                }
                break;
            case 1912965437:
                if (str.equals("play_error")) {
                    c = 14;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                if (TextUtils.isEmpty(str2) || (c7891il = this.f17230PX.get(str2)) == null) {
                    return;
                }
                c7891il.eqN(SystemClock.elapsedRealtime());
                return;
            case 1:
                if (TextUtils.isEmpty(str2) || (c7891il2 = this.f17230PX.get(str2)) == null) {
                    return;
                }
                c7891il2.m87460bX(SystemClock.elapsedRealtime());
                return;
            case 2:
                if (TextUtils.isEmpty(str2) || this.f17230PX.get(str2) != null) {
                    return;
                }
                C7891IL c7891il7 = new C7891IL();
                this.f17230PX.put(str2, c7891il7);
                c7891il7.m87458bg(SystemClock.elapsedRealtime());
                return;
            case 3:
            case '\b':
            case '\f':
            case 14:
                if (TextUtils.isEmpty(str2) || (c7891il3 = this.f17233WR.get(str2)) == null || c7891il3.m87459bg() == C7891IL.f17220zx) {
                    return;
                }
                c7891il3.m87461IL(SystemClock.elapsedRealtime());
                if (C9305bg.m83103bg().m83114Lq()) {
                    this.f17236eo = (int) (this.f17236eo + c7891il3.m87457bg(this.yDt, SystemClock.elapsedRealtime()));
                    return;
                }
                return;
            case 4:
                this.ldr.add(Long.valueOf(SystemClock.elapsedRealtime()));
                if (C9305bg.m83103bg().m83116Kg()) {
                    this.f17237iR++;
                }
                if (TextUtils.isEmpty(str2) || this.f17233WR.get(str2) != null) {
                    return;
                }
                C7891IL c7891il8 = new C7891IL();
                this.f17233WR.put(str2, c7891il8);
                c7891il8.m87458bg(SystemClock.elapsedRealtime());
                return;
            case 5:
                this.f17235bg.add(Long.valueOf(SystemClock.elapsedRealtime()));
                if (C9305bg.m83103bg().ldr()) {
                    this.f17234bX++;
                    return;
                }
                return;
            case 6:
                if (this.f17229Lq.contains(str2)) {
                    return;
                }
                if (this.f17229Lq.size() > 50) {
                    this.f17229Lq.subList(0, 25).clear();
                }
                this.f17229Lq.add(str2);
                this.eqN.add(Long.valueOf(SystemClock.elapsedRealtime()));
                if (C9305bg.m83103bg().m83095iR()) {
                    this.f17238zx++;
                    return;
                }
                return;
            case 7:
                if (TextUtils.isEmpty(str2) || (c7891il4 = this.f17233WR.get(str2)) == null) {
                    return;
                }
                c7891il4.eqN(SystemClock.elapsedRealtime());
                return;
            case '\t':
                if (TextUtils.isEmpty(str2) || (c7891il5 = this.f17233WR.get(str2)) == null) {
                    return;
                }
                c7891il5.m87460bX(SystemClock.elapsedRealtime());
                return;
            case '\n':
                if (TextUtils.isEmpty(str2) || (c7891il6 = this.f17230PX.get(str2)) == null || c7891il6.m87459bg() == C7891IL.f17220zx) {
                    return;
                }
                c7891il6.m87461IL(SystemClock.elapsedRealtime());
                if (C9305bg.m83103bg().yDt()) {
                    this.f17231Ta = (int) (this.f17231Ta + c7891il6.m87457bg(this.yDt, SystemClock.elapsedRealtime()));
                    return;
                }
                return;
            case 11:
                if (C9305bg.m83103bg().xxp()) {
                    this.f17232VB++;
                    return;
                }
                return;
            case '\r':
                this.f17228Kg.add(Long.valueOf(SystemClock.elapsedRealtime()));
                return;
            default:
                return;
        }
    }

    /* renamed from: IL */
    public String m87454IL() {
        return this.f17227IL;
    }

    /* renamed from: bg */
    public JSONObject m87448bg(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            m87447bg(jSONObject2, jSONObject);
            m87453IL(jSONObject2, jSONObject);
        } catch (Throwable th) {
            C7741PX.m87880IL(th.getMessage());
        }
        return jSONObject2;
    }

    /* renamed from: bg */
    private void m87449bg(String str, JSONObject jSONObject, ArrayList<Long> arrayList, int[] iArr, long j, JSONObject jSONObject2) throws JSONException {
        int size = arrayList.size() - 1;
        int i = 0;
        for (int i2 : iArr) {
            long j2 = j - (i2 * 60000);
            while (size >= 0 && arrayList.get(size).longValue() >= j2) {
                i++;
                size--;
            }
            if (i != 0) {
                jSONObject.put(str + i2, i);
                int optInt = jSONObject2.optInt(str + i2) + i;
                if (optInt != 0) {
                    jSONObject2.put(str + i2, optInt);
                }
            }
        }
        while (size >= 0) {
            arrayList.remove(0);
            size--;
        }
    }

    /* renamed from: bg */
    private void m87447bg(@NonNull JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        int i;
        int i2;
        int i3;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        m87449bg("show_c_", jSONObject, this.f17235bg, C9305bg.m83103bg().m83110WR(), elapsedRealtime, jSONObject2);
        m87449bg("click_c_", jSONObject, this.eqN, C9305bg.m83103bg().m83096eo(), elapsedRealtime, jSONObject2);
        m87449bg("v_play_c_", jSONObject, this.ldr, C9305bg.m83103bg().m83111VB(), elapsedRealtime, jSONObject2);
        m87449bg("dislike_c_", jSONObject, this.f17228Kg, C9305bg.m83103bg().m83093vb(), elapsedRealtime, jSONObject2);
        if (C9305bg.m83103bg().ldr() && (i3 = this.f17234bX) != 0) {
            jSONObject.put("show_c_s", i3);
            int optInt = jSONObject2.optInt("show_c_s") + this.f17234bX;
            if (optInt != 0) {
                jSONObject2.put("show_c_s", optInt);
            }
        }
        if (C9305bg.m83103bg().m83095iR() && (i2 = this.f17238zx) != 0) {
            jSONObject.put("click_c_s", i2);
            int optInt2 = jSONObject2.optInt("click_c_s") + this.f17238zx;
            if (optInt2 != 0) {
                jSONObject2.put("click_c_s", optInt2);
            }
        }
        if (!C9305bg.m83103bg().m83116Kg() || (i = this.f17237iR) == 0) {
            return;
        }
        jSONObject.put("v_play_c_s", i);
        int optInt3 = jSONObject2.optInt("v_play_c_s") + this.f17237iR;
        if (optInt3 != 0) {
            jSONObject2.put("v_play_c_s", optInt3);
        }
    }

    /* renamed from: bg */
    public void m87452bg() {
        this.yDt = SystemClock.elapsedRealtime();
        this.f17232VB = 0;
        this.f17238zx = 0;
        this.f17234bX = 0;
        this.f17231Ta = 0;
        this.f17236eo = 0;
        this.f17237iR = 0;
    }

    @Override // java.lang.Comparable
    /* renamed from: bg */
    public int compareTo(C7893bg c7893bg) {
        return c7893bg.f17234bX - this.f17234bX;
    }
}
