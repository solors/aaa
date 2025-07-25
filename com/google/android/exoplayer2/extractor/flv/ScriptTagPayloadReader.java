package com.google.android.exoplayer2.extractor.flv;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.extractor.DummyTrackOutput;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
final class ScriptTagPayloadReader extends TagPayloadReader {

    /* renamed from: b */
    private long f33025b;

    /* renamed from: c */
    private long[] f33026c;

    /* renamed from: d */
    private long[] f33027d;

    public ScriptTagPayloadReader() {
        super(new DummyTrackOutput());
        this.f33025b = -9223372036854775807L;
        this.f33026c = new long[0];
        this.f33027d = new long[0];
    }

    /* renamed from: c */
    private static Boolean m74647c(ParsableByteArray parsableByteArray) {
        boolean z = true;
        if (parsableByteArray.readUnsignedByte() != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Nullable
    /* renamed from: d */
    private static Object m74646d(ParsableByteArray parsableByteArray, int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 8) {
                            if (i != 10) {
                                if (i != 11) {
                                    return null;
                                }
                                return m74645e(parsableByteArray);
                            }
                            return m74641i(parsableByteArray);
                        }
                        return m74643g(parsableByteArray);
                    }
                    return m74642h(parsableByteArray);
                }
                return m74640j(parsableByteArray);
            }
            return m74647c(parsableByteArray);
        }
        return m74644f(parsableByteArray);
    }

    /* renamed from: e */
    private static Date m74645e(ParsableByteArray parsableByteArray) {
        Date date = new Date((long) m74644f(parsableByteArray).doubleValue());
        parsableByteArray.skipBytes(2);
        return date;
    }

    /* renamed from: f */
    private static Double m74644f(ParsableByteArray parsableByteArray) {
        return Double.valueOf(Double.longBitsToDouble(parsableByteArray.readLong()));
    }

    /* renamed from: g */
    private static HashMap<String, Object> m74643g(ParsableByteArray parsableByteArray) {
        int readUnsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        HashMap<String, Object> hashMap = new HashMap<>(readUnsignedIntToInt);
        for (int i = 0; i < readUnsignedIntToInt; i++) {
            String m74640j = m74640j(parsableByteArray);
            Object m74646d = m74646d(parsableByteArray, m74639k(parsableByteArray));
            if (m74646d != null) {
                hashMap.put(m74640j, m74646d);
            }
        }
        return hashMap;
    }

    /* renamed from: h */
    private static HashMap<String, Object> m74642h(ParsableByteArray parsableByteArray) {
        HashMap<String, Object> hashMap = new HashMap<>();
        while (true) {
            String m74640j = m74640j(parsableByteArray);
            int m74639k = m74639k(parsableByteArray);
            if (m74639k == 9) {
                return hashMap;
            }
            Object m74646d = m74646d(parsableByteArray, m74639k);
            if (m74646d != null) {
                hashMap.put(m74640j, m74646d);
            }
        }
    }

    /* renamed from: i */
    private static ArrayList<Object> m74641i(ParsableByteArray parsableByteArray) {
        int readUnsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        ArrayList<Object> arrayList = new ArrayList<>(readUnsignedIntToInt);
        for (int i = 0; i < readUnsignedIntToInt; i++) {
            Object m74646d = m74646d(parsableByteArray, m74639k(parsableByteArray));
            if (m74646d != null) {
                arrayList.add(m74646d);
            }
        }
        return arrayList;
    }

    /* renamed from: j */
    private static String m74640j(ParsableByteArray parsableByteArray) {
        int readUnsignedShort = parsableByteArray.readUnsignedShort();
        int position = parsableByteArray.getPosition();
        parsableByteArray.skipBytes(readUnsignedShort);
        return new String(parsableByteArray.getData(), position, readUnsignedShort);
    }

    /* renamed from: k */
    private static int m74639k(ParsableByteArray parsableByteArray) {
        return parsableByteArray.readUnsignedByte();
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    /* renamed from: a */
    protected boolean mo74638a(ParsableByteArray parsableByteArray) {
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    /* renamed from: b */
    protected boolean mo74637b(ParsableByteArray parsableByteArray, long j) {
        if (m74639k(parsableByteArray) != 2 || !"onMetaData".equals(m74640j(parsableByteArray)) || parsableByteArray.bytesLeft() == 0 || m74639k(parsableByteArray) != 8) {
            return false;
        }
        HashMap<String, Object> m74643g = m74643g(parsableByteArray);
        Object obj = m74643g.get("duration");
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (doubleValue > 0.0d) {
                this.f33025b = (long) (doubleValue * 1000000.0d);
            }
        }
        Object obj2 = m74643g.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f33026c = new long[size];
                this.f33027d = new long[size];
                for (int i = 0; i < size; i++) {
                    Object obj5 = list.get(i);
                    Object obj6 = list2.get(i);
                    if ((obj6 instanceof Double) && (obj5 instanceof Double)) {
                        this.f33026c[i] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.f33027d[i] = ((Double) obj5).longValue();
                    } else {
                        this.f33026c = new long[0];
                        this.f33027d = new long[0];
                        break;
                    }
                }
            }
        }
        return false;
    }

    public long getDurationUs() {
        return this.f33025b;
    }

    public long[] getKeyFrameTagPositions() {
        return this.f33027d;
    }

    public long[] getKeyFrameTimesUs() {
        return this.f33026c;
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    public void seek() {
    }
}
