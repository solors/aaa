package com.google.android.material.color;

import android.content.Context;
import android.util.Pair;
import androidx.annotation.ColorInt;
import com.google.common.primitives.SignedBytes;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class ColorResourcesTableCreator {

    /* renamed from: a */
    private static byte f37172a;

    /* renamed from: b */
    private static final PackageInfo f37173b = new PackageInfo(1, "android");

    /* renamed from: c */
    private static final Comparator<ColorResource> f37174c = new Comparator<ColorResource>() { // from class: com.google.android.material.color.ColorResourcesTableCreator.1
        @Override // java.util.Comparator
        public int compare(ColorResource colorResource, ColorResource colorResource2) {
            return colorResource.f37177c - colorResource2.f37177c;
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class ColorResource {

        /* renamed from: a */
        private final byte f37175a;

        /* renamed from: b */
        private final byte f37176b;

        /* renamed from: c */
        private final short f37177c;

        /* renamed from: d */
        private final String f37178d;
        @ColorInt

        /* renamed from: e */
        private final int f37179e;

        ColorResource(int i, String str, int i2) {
            this.f37178d = str;
            this.f37179e = i2;
            this.f37177c = (short) (65535 & i);
            this.f37176b = (byte) ((i >> 16) & 255);
            this.f37175a = (byte) ((i >> 24) & 255);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class PackageChunk {

        /* renamed from: a */
        private final ResChunkHeader f37180a;

        /* renamed from: b */
        private final PackageInfo f37181b;

        /* renamed from: c */
        private final StringPoolChunk f37182c = new StringPoolChunk(false, "?1", "?2", "?3", "?4", "?5", "color");

        /* renamed from: d */
        private final StringPoolChunk f37183d;

        /* renamed from: e */
        private final TypeSpecChunk f37184e;

        PackageChunk(PackageInfo packageInfo, List<ColorResource> list) {
            this.f37181b = packageInfo;
            String[] strArr = new String[list.size()];
            for (int i = 0; i < list.size(); i++) {
                strArr[i] = list.get(i).f37178d;
            }
            this.f37183d = new StringPoolChunk(true, strArr);
            this.f37184e = new TypeSpecChunk(list);
            this.f37180a = new ResChunkHeader((short) 512, (short) 288, m71688a());
        }

        /* renamed from: a */
        int m71688a() {
            return this.f37182c.m71680a() + 288 + this.f37183d.m71680a() + this.f37184e.m71670b();
        }

        /* renamed from: b */
        void m71687b(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.f37180a.m71684a(byteArrayOutputStream);
            byteArrayOutputStream.write(ColorResourcesTableCreator.m71697j(this.f37181b.f37185a));
            char[] charArray = this.f37181b.f37186b.toCharArray();
            for (int i = 0; i < 128; i++) {
                if (i < charArray.length) {
                    byteArrayOutputStream.write(ColorResourcesTableCreator.m71699h(charArray[i]));
                } else {
                    byteArrayOutputStream.write(ColorResourcesTableCreator.m71699h((char) 0));
                }
            }
            byteArrayOutputStream.write(ColorResourcesTableCreator.m71697j(288));
            byteArrayOutputStream.write(ColorResourcesTableCreator.m71697j(0));
            byteArrayOutputStream.write(ColorResourcesTableCreator.m71697j(this.f37182c.m71680a() + 288));
            byteArrayOutputStream.write(ColorResourcesTableCreator.m71697j(0));
            byteArrayOutputStream.write(ColorResourcesTableCreator.m71697j(0));
            this.f37182c.m71678c(byteArrayOutputStream);
            this.f37183d.m71678c(byteArrayOutputStream);
            this.f37184e.m71669c(byteArrayOutputStream);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class PackageInfo {

        /* renamed from: a */
        private final int f37185a;

        /* renamed from: b */
        private final String f37186b;

        PackageInfo(int i, String str) {
            this.f37185a = i;
            this.f37186b = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class ResChunkHeader {

        /* renamed from: a */
        private final short f37187a;

        /* renamed from: b */
        private final short f37188b;

        /* renamed from: c */
        private final int f37189c;

        ResChunkHeader(short s, short s2, int i) {
            this.f37187a = s;
            this.f37188b = s2;
            this.f37189c = i;
        }

        /* renamed from: a */
        void m71684a(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            byteArrayOutputStream.write(ColorResourcesTableCreator.m71696k(this.f37187a));
            byteArrayOutputStream.write(ColorResourcesTableCreator.m71696k(this.f37188b));
            byteArrayOutputStream.write(ColorResourcesTableCreator.m71697j(this.f37189c));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class ResEntry {

        /* renamed from: a */
        private final int f37190a;

        /* renamed from: b */
        private final int f37191b;

        ResEntry(int i, @ColorInt int i2) {
            this.f37190a = i;
            this.f37191b = i2;
        }

        /* renamed from: a */
        void m71683a(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            byteArrayOutputStream.write(ColorResourcesTableCreator.m71696k((short) 8));
            byteArrayOutputStream.write(ColorResourcesTableCreator.m71696k((short) 2));
            byteArrayOutputStream.write(ColorResourcesTableCreator.m71697j(this.f37190a));
            byteArrayOutputStream.write(ColorResourcesTableCreator.m71696k((short) 8));
            byteArrayOutputStream.write(new byte[]{0, 28});
            byteArrayOutputStream.write(ColorResourcesTableCreator.m71697j(this.f37191b));
        }
    }

    /* loaded from: classes5.dex */
    private static class ResTable {

        /* renamed from: a */
        private final ResChunkHeader f37192a;

        /* renamed from: b */
        private final int f37193b;

        /* renamed from: d */
        private final List<PackageChunk> f37195d = new ArrayList();

        /* renamed from: c */
        private final StringPoolChunk f37194c = new StringPoolChunk(new String[0]);

        ResTable(Map<PackageInfo, List<ColorResource>> map) {
            this.f37193b = map.size();
            for (Map.Entry<PackageInfo, List<ColorResource>> entry : map.entrySet()) {
                List<ColorResource> value = entry.getValue();
                Collections.sort(value, ColorResourcesTableCreator.f37174c);
                this.f37195d.add(new PackageChunk(entry.getKey(), value));
            }
            this.f37192a = new ResChunkHeader((short) 2, (short) 12, m71682a());
        }

        /* renamed from: a */
        private int m71682a() {
            int i = 0;
            for (PackageChunk packageChunk : this.f37195d) {
                i += packageChunk.m71688a();
            }
            return this.f37194c.m71680a() + 12 + i;
        }

        /* renamed from: b */
        void m71681b(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.f37192a.m71684a(byteArrayOutputStream);
            byteArrayOutputStream.write(ColorResourcesTableCreator.m71697j(this.f37193b));
            this.f37194c.m71678c(byteArrayOutputStream);
            for (PackageChunk packageChunk : this.f37195d) {
                packageChunk.m71687b(byteArrayOutputStream);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class StringPoolChunk {

        /* renamed from: a */
        private final ResChunkHeader f37196a;

        /* renamed from: b */
        private final int f37197b;

        /* renamed from: c */
        private final int f37198c;

        /* renamed from: d */
        private final int f37199d;

        /* renamed from: e */
        private final int f37200e;

        /* renamed from: f */
        private final List<Integer> f37201f;

        /* renamed from: g */
        private final List<Integer> f37202g;

        /* renamed from: h */
        private final List<byte[]> f37203h;

        /* renamed from: i */
        private final List<List<StringStyledSpan>> f37204i;

        /* renamed from: j */
        private final boolean f37205j;

        /* renamed from: k */
        private final int f37206k;

        /* renamed from: l */
        private final int f37207l;

        StringPoolChunk(String... strArr) {
            this(false, strArr);
        }

        /* renamed from: b */
        private Pair<byte[], List<StringStyledSpan>> m71679b(String str) {
            return new Pair<>(this.f37205j ? ColorResourcesTableCreator.m71694m(str) : ColorResourcesTableCreator.m71695l(str), Collections.emptyList());
        }

        /* renamed from: a */
        int m71680a() {
            return this.f37207l;
        }

        /* renamed from: c */
        void m71678c(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            int i;
            this.f37196a.m71684a(byteArrayOutputStream);
            byteArrayOutputStream.write(ColorResourcesTableCreator.m71697j(this.f37197b));
            byteArrayOutputStream.write(ColorResourcesTableCreator.m71697j(this.f37198c));
            if (this.f37205j) {
                i = 256;
            } else {
                i = 0;
            }
            byteArrayOutputStream.write(ColorResourcesTableCreator.m71697j(i));
            byteArrayOutputStream.write(ColorResourcesTableCreator.m71697j(this.f37199d));
            byteArrayOutputStream.write(ColorResourcesTableCreator.m71697j(this.f37200e));
            for (Integer num : this.f37201f) {
                byteArrayOutputStream.write(ColorResourcesTableCreator.m71697j(num.intValue()));
            }
            for (Integer num2 : this.f37202g) {
                byteArrayOutputStream.write(ColorResourcesTableCreator.m71697j(num2.intValue()));
            }
            for (byte[] bArr : this.f37203h) {
                byteArrayOutputStream.write(bArr);
            }
            int i2 = this.f37206k;
            if (i2 > 0) {
                byteArrayOutputStream.write(new byte[i2]);
            }
            for (List<StringStyledSpan> list : this.f37204i) {
                for (StringStyledSpan stringStyledSpan : list) {
                    stringStyledSpan.m71676b(byteArrayOutputStream);
                }
                byteArrayOutputStream.write(ColorResourcesTableCreator.m71697j(-1));
            }
        }

        StringPoolChunk(boolean z, String... strArr) {
            this.f37201f = new ArrayList();
            this.f37202g = new ArrayList();
            this.f37203h = new ArrayList();
            this.f37204i = new ArrayList();
            this.f37205j = z;
            int i = 0;
            for (String str : strArr) {
                Pair<byte[], List<StringStyledSpan>> m71679b = m71679b(str);
                this.f37201f.add(Integer.valueOf(i));
                Object obj = m71679b.first;
                i += ((byte[]) obj).length;
                this.f37203h.add((byte[]) obj);
                this.f37204i.add((List) m71679b.second);
            }
            int i2 = 0;
            for (List<StringStyledSpan> list : this.f37204i) {
                for (StringStyledSpan stringStyledSpan : list) {
                    this.f37201f.add(Integer.valueOf(i));
                    i += stringStyledSpan.f37208a.length;
                    this.f37203h.add(stringStyledSpan.f37208a);
                }
                this.f37202g.add(Integer.valueOf(i2));
                i2 += (list.size() * 12) + 4;
            }
            int i3 = i % 4;
            int i4 = i3 == 0 ? 0 : 4 - i3;
            this.f37206k = i4;
            int size = this.f37203h.size();
            this.f37197b = size;
            this.f37198c = this.f37203h.size() - strArr.length;
            boolean z2 = this.f37203h.size() - strArr.length > 0;
            if (!z2) {
                this.f37202g.clear();
                this.f37204i.clear();
            }
            int size2 = (size * 4) + 28 + (this.f37202g.size() * 4);
            this.f37199d = size2;
            int i5 = i + i4;
            this.f37200e = z2 ? size2 + i5 : 0;
            int i6 = size2 + i5 + (z2 ? i2 : 0);
            this.f37207l = i6;
            this.f37196a = new ResChunkHeader((short) 1, (short) 28, i6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class StringStyledSpan {

        /* renamed from: a */
        private byte[] f37208a;

        /* renamed from: b */
        private int f37209b;

        /* renamed from: c */
        private int f37210c;

        /* renamed from: d */
        private int f37211d;

        private StringStyledSpan() {
        }

        /* renamed from: b */
        void m71676b(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            byteArrayOutputStream.write(ColorResourcesTableCreator.m71697j(this.f37209b));
            byteArrayOutputStream.write(ColorResourcesTableCreator.m71697j(this.f37210c));
            byteArrayOutputStream.write(ColorResourcesTableCreator.m71697j(this.f37211d));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class TypeChunk {

        /* renamed from: a */
        private final ResChunkHeader f37212a;

        /* renamed from: b */
        private final int f37213b;

        /* renamed from: c */
        private final byte[] f37214c;

        /* renamed from: d */
        private final int[] f37215d;

        /* renamed from: e */
        private final ResEntry[] f37216e;

        TypeChunk(List<ColorResource> list, Set<Short> set, int i) {
            byte[] bArr = new byte[64];
            this.f37214c = bArr;
            this.f37213b = i;
            bArr[0] = SignedBytes.MAX_POWER_OF_TWO;
            this.f37216e = new ResEntry[list.size()];
            for (int i2 = 0; i2 < list.size(); i2++) {
                this.f37216e[i2] = new ResEntry(i2, list.get(i2).f37179e);
            }
            this.f37215d = new int[i];
            int i3 = 0;
            for (short s = 0; s < i; s = (short) (s + 1)) {
                if (set.contains(Short.valueOf(s))) {
                    this.f37215d[s] = i3;
                    i3 += 16;
                } else {
                    this.f37215d[s] = -1;
                }
            }
            this.f37212a = new ResChunkHeader((short) 513, (short) 84, m71675a());
        }

        /* renamed from: b */
        private int m71674b() {
            return m71673c() + 84;
        }

        /* renamed from: c */
        private int m71673c() {
            return this.f37215d.length * 4;
        }

        /* renamed from: a */
        int m71675a() {
            return m71674b() + (this.f37216e.length * 16);
        }

        /* renamed from: d */
        void m71672d(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.f37212a.m71684a(byteArrayOutputStream);
            byteArrayOutputStream.write(new byte[]{ColorResourcesTableCreator.f37172a, 0, 0, 0});
            byteArrayOutputStream.write(ColorResourcesTableCreator.m71697j(this.f37213b));
            byteArrayOutputStream.write(ColorResourcesTableCreator.m71697j(m71674b()));
            byteArrayOutputStream.write(this.f37214c);
            for (int i : this.f37215d) {
                byteArrayOutputStream.write(ColorResourcesTableCreator.m71697j(i));
            }
            for (ResEntry resEntry : this.f37216e) {
                resEntry.m71683a(byteArrayOutputStream);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class TypeSpecChunk {

        /* renamed from: a */
        private final ResChunkHeader f37217a;

        /* renamed from: b */
        private final int f37218b;

        /* renamed from: c */
        private final int[] f37219c;

        /* renamed from: d */
        private final TypeChunk f37220d;

        TypeSpecChunk(List<ColorResource> list) {
            this.f37218b = list.get(list.size() - 1).f37177c + 1;
            HashSet hashSet = new HashSet();
            for (ColorResource colorResource : list) {
                hashSet.add(Short.valueOf(colorResource.f37177c));
            }
            this.f37219c = new int[this.f37218b];
            for (short s = 0; s < this.f37218b; s = (short) (s + 1)) {
                if (hashSet.contains(Short.valueOf(s))) {
                    this.f37219c[s] = 1073741824;
                }
            }
            this.f37217a = new ResChunkHeader((short) 514, (short) 16, m71671a());
            this.f37220d = new TypeChunk(list, hashSet, this.f37218b);
        }

        /* renamed from: a */
        private int m71671a() {
            return (this.f37218b * 4) + 16;
        }

        /* renamed from: b */
        int m71670b() {
            return m71671a() + this.f37220d.m71675a();
        }

        /* renamed from: c */
        void m71669c(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.f37217a.m71684a(byteArrayOutputStream);
            byteArrayOutputStream.write(new byte[]{ColorResourcesTableCreator.f37172a, 0, 0, 0});
            byteArrayOutputStream.write(ColorResourcesTableCreator.m71697j(this.f37218b));
            for (int i : this.f37219c) {
                byteArrayOutputStream.write(ColorResourcesTableCreator.m71697j(i));
            }
            this.f37220d.m71672d(byteArrayOutputStream);
        }
    }

    private ColorResourcesTableCreator() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static byte[] m71699h(char c) {
        return new byte[]{(byte) (c & 255), (byte) ((c >> '\b') & 255)};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static byte[] m71698i(Context context, Map<Integer, Integer> map) throws IOException {
        PackageInfo packageInfo;
        if (!map.entrySet().isEmpty()) {
            PackageInfo packageInfo2 = new PackageInfo(127, context.getPackageName());
            HashMap hashMap = new HashMap();
            ColorResource colorResource = null;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                ColorResource colorResource2 = new ColorResource(entry.getKey().intValue(), context.getResources().getResourceName(entry.getKey().intValue()), entry.getValue().intValue());
                if (context.getResources().getResourceTypeName(entry.getKey().intValue()).equals("color")) {
                    if (colorResource2.f37175a == 1) {
                        packageInfo = f37173b;
                    } else if (colorResource2.f37175a == Byte.MAX_VALUE) {
                        packageInfo = packageInfo2;
                    } else {
                        throw new IllegalArgumentException("Not supported with unknown package id: " + ((int) colorResource2.f37175a));
                    }
                    if (!hashMap.containsKey(packageInfo)) {
                        hashMap.put(packageInfo, new ArrayList());
                    }
                    ((List) hashMap.get(packageInfo)).add(colorResource2);
                    colorResource = colorResource2;
                } else {
                    throw new IllegalArgumentException("Non color resource found: name=" + colorResource2.f37178d + ", typeId=" + Integer.toHexString(colorResource2.f37176b & 255));
                }
            }
            byte b = colorResource.f37176b;
            f37172a = b;
            if (b != 0) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                new ResTable(hashMap).m71681b(byteArrayOutputStream);
                return byteArrayOutputStream.toByteArray();
            }
            throw new IllegalArgumentException("No color resources found for harmonization.");
        }
        throw new IllegalArgumentException("No color resources provided for harmonization.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static byte[] m71697j(int i) {
        return new byte[]{(byte) (i & 255), (byte) ((i >> 8) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 24) & 255)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static byte[] m71696k(short s) {
        return new byte[]{(byte) (s & 255), (byte) ((s >> 8) & 255)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static byte[] m71695l(String str) {
        char[] charArray = str.toCharArray();
        int length = (charArray.length * 2) + 4;
        byte[] bArr = new byte[length];
        byte[] m71696k = m71696k((short) charArray.length);
        bArr[0] = m71696k[0];
        bArr[1] = m71696k[1];
        for (int i = 0; i < charArray.length; i++) {
            byte[] m71699h = m71699h(charArray[i]);
            int i2 = i * 2;
            bArr[i2 + 2] = m71699h[0];
            bArr[i2 + 3] = m71699h[1];
        }
        bArr[length - 2] = 0;
        bArr[length - 1] = 0;
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static byte[] m71694m(String str) {
        byte[] bytes = str.getBytes(Charset.forName("UTF-8"));
        byte length = (byte) bytes.length;
        int length2 = bytes.length + 3;
        byte[] bArr = new byte[length2];
        System.arraycopy(bytes, 0, bArr, 2, length);
        bArr[1] = length;
        bArr[0] = length;
        bArr[length2 - 1] = 0;
        return bArr;
    }
}
