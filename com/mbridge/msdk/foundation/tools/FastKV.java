package com.mbridge.msdk.foundation.tools;

import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.mbridge.msdk.foundation.tools.Container;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public class FastKV {
    static final int ASYNC_BLOCKING = 1;
    private static final String A_SUFFIX = ".kva";
    private static final int BASE_GC_BYTES_THRESHOLD = 4096;
    private static final int BASE_GC_KEYS_THRESHOLD = 80;
    private static final String BOTH_FILES_ERROR = "both files error";
    private static final String B_SUFFIX = ".kvb";
    private static final String C_SUFFIX = ".kvc";
    private static final int DATA_SIZE_LIMIT = 536870912;
    private static final int DATA_START = 12;
    private static final int DOUBLE_LIMIT;
    private static final byte[] EMPTY_ARRAY = new byte[0];
    static final String GC_FINISH = "gc finish";
    private static final int INTERNAL_LIMIT = 2048;
    private static final String MAP_FAILED = "map failed";
    static final int NON_BLOCKING = 0;
    private static final String OPEN_FILE_FAILED = "open file failed";
    private static final int PAGE_SIZE;
    private static final String PARSE_DATA_FAILED = "parse dara failed";
    static final int SYNC_BLOCKING = 2;
    private static final String TEMP_SUFFIX = ".tmp";
    static final String TRUNCATE_FINISH = "truncate finish";
    private static final int TRUNCATE_THRESHOLD;
    private static final int[] TYPE_SIZE;
    private MappedByteBuffer aBuffer;
    private FileChannel aChannel;
    private MappedByteBuffer bBuffer;
    private FileChannel bChannel;
    private long checksum;
    private int dataEnd;
    private final Map<String, InterfaceC22021a> encoderMap;
    private FastBuffer fastBuffer;
    private int invalidBytes;
    private final String name;
    private final String path;
    private int removeStart;
    private boolean sizeChanged;
    private String tempExternalName;
    private int updateSize;
    private int updateStart;
    private int writingMode;
    private final Map<String, Container.AbstractC22056b> data = new HashMap();
    private final Executor executor = new LimitExecutor();
    private final ArrayList<C22023c> invalids = new ArrayList<>();
    private final InterfaceC22022b logger = FastKVConfig.f57020b;
    private boolean autoCommit = true;

    /* loaded from: classes6.dex */
    public static class Builder {
        private static final Map<String, FastKV> INSTANCE_MAP = new ConcurrentHashMap();
        private InterfaceC22021a[] encoders;
        private final String name;
        private final String path;
        private int writingMode = 0;

        public Builder(String str, String str2) {
            if (str != null && !str.isEmpty()) {
                if (str2 != null && !str2.isEmpty()) {
                    if (!str.endsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
                        str = str + '/';
                    }
                    this.path = str;
                    this.name = str2;
                    return;
                }
                throw new IllegalArgumentException("name is empty");
            }
            throw new IllegalArgumentException("path is empty");
        }

        public Builder asyncBlocking() {
            this.writingMode = 1;
            return this;
        }

        public Builder blocking() {
            this.writingMode = 2;
            return this;
        }

        public FastKV build() {
            String str = this.path + this.name;
            Map<String, FastKV> map = INSTANCE_MAP;
            FastKV fastKV = map.get(str);
            if (fastKV == null) {
                synchronized (Builder.class) {
                    fastKV = map.get(str);
                    if (fastKV == null) {
                        fastKV = new FastKV(this.path, this.name, this.encoders, this.writingMode);
                        map.put(str, fastKV);
                    }
                }
            }
            return fastKV;
        }

        public Builder encoder(InterfaceC22021a[] interfaceC22021aArr) {
            this.encoders = interfaceC22021aArr;
            return this;
        }
    }

    /* renamed from: com.mbridge.msdk.foundation.tools.FastKV$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC22021a<T> {
        /* renamed from: a */
        T mo51694a(byte[] bArr, int i, int i2);

        /* renamed from: a */
        String mo51696a();

        /* renamed from: a */
        byte[] mo51695a(T t);
    }

    /* renamed from: com.mbridge.msdk.foundation.tools.FastKV$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC22022b {
        /* renamed from: a */
        void mo51621a(String str, Exception exc);

        /* renamed from: a */
        void mo51620a(String str, String str2);

        /* renamed from: b */
        void mo51619b(String str, Exception exc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.mbridge.msdk.foundation.tools.FastKV$c */
    /* loaded from: classes6.dex */
    public static class C22023c implements Comparable<C22023c> {

        /* renamed from: a */
        int f56827a;

        /* renamed from: b */
        int f56828b;

        C22023c(int i, int i2) {
            this.f56828b = i;
            this.f56827a = i2;
        }

        @Override // java.lang.Comparable
        public final /* bridge */ /* synthetic */ int compareTo(C22023c c22023c) {
            return this.f56828b - c22023c.f56828b;
        }
    }

    static {
        int m51686a = C22048ar.m51686a();
        PAGE_SIZE = m51686a;
        int max = Math.max(m51686a << 1, 16384);
        DOUBLE_LIMIT = max;
        TRUNCATE_THRESHOLD = max << 1;
        TYPE_SIZE = new int[]{0, 1, 4, 4, 8, 8};
    }

    FastKV(String str, String str2, InterfaceC22021a[] interfaceC22021aArr, int i) {
        this.path = str;
        this.name = str2;
        this.writingMode = i;
        HashMap hashMap = new HashMap();
        hashMap.put("StringSet", StringSetEncoder.f56947a);
        if (interfaceC22021aArr != null && interfaceC22021aArr.length > 0) {
            for (InterfaceC22021a interfaceC22021a : interfaceC22021aArr) {
                String mo51696a = interfaceC22021a.mo51696a();
                if (hashMap.containsKey(mo51696a)) {
                    error("duplicate encoder tag:" + mo51696a);
                } else {
                    hashMap.put(mo51696a, interfaceC22021a);
                }
            }
        }
        this.encoderMap = hashMap;
        loadData();
    }

    private void addObject(String str, Object obj, byte[] bArr, byte b) {
        boolean z;
        String str2;
        int length;
        Container.AbstractC22056b c22062h;
        int saveArray = saveArray(str, bArr, b);
        if (saveArray != 0) {
            String str3 = this.tempExternalName;
            if (str3 != null) {
                z = true;
            } else {
                z = false;
            }
            boolean z2 = z;
            if (z2) {
                this.tempExternalName = null;
                length = 32;
                str2 = str3;
            } else {
                str2 = obj;
                length = bArr.length;
            }
            if (b == 6) {
                c22062h = new Container.C22063i(this.updateStart, saveArray, (String) str2, length, z2);
            } else if (b == 7) {
                c22062h = new Container.C22055a(this.updateStart, saveArray, str2, length, z2);
            } else {
                c22062h = new Container.C22062h(this.updateStart, saveArray, str2, length, z2);
            }
            this.data.put(str, c22062h);
            updateChange();
        }
    }

    private void addOrUpdate(String str, Object obj, byte[] bArr, Container.AbstractC22064j abstractC22064j, byte b) {
        if (abstractC22064j == null) {
            addObject(str, obj, bArr, b);
        } else if (!abstractC22064j.f56999b && abstractC22064j.f57002e == bArr.length) {
            updateBytes(abstractC22064j.f56993a, bArr);
            abstractC22064j.f57001d = obj;
        } else {
            updateObject(str, obj, bArr, abstractC22064j);
        }
        checkIfCommit();
    }

    private int bytesThreshold() {
        int i = this.dataEnd;
        if (i <= 16384) {
            return 4096;
        }
        if (i > 65536) {
            return 16384;
        }
        return 8192;
    }

    private void checkGC() {
        int i;
        if (this.invalidBytes < (bytesThreshold() << 1)) {
            int size = this.invalids.size();
            if (this.dataEnd < 16384) {
                i = 80;
            } else {
                i = 160;
            }
            if (size < i) {
                return;
            }
        }
        m51930gc(0);
    }

    private void checkIfCommit() {
        if (this.writingMode != 0 && this.autoCommit) {
            commitToCFile();
        }
    }

    private void checkKey(String str) {
        if (str != null && !str.isEmpty()) {
            return;
        }
        throw new IllegalArgumentException("key is empty");
    }

    private void checkKeySize(int i) {
        if (i <= 255) {
            return;
        }
        throw new IllegalArgumentException("key's length must less than 256");
    }

    private void checkValueSize(int i, boolean z) {
        if (z) {
            if (i != 32) {
                throw new IllegalStateException("name size not match");
            }
        } else if (i >= 0 && i < 2048) {
        } else {
            throw new IllegalStateException("value size out of bound");
        }
    }

    private void clearData() {
        this.dataEnd = 12;
        this.checksum = 0L;
        clearInvalid();
        this.data.clear();
        FastBuffer fastBuffer = this.fastBuffer;
        if (fastBuffer != null && fastBuffer.f57016a.length == PAGE_SIZE) {
            fastBuffer.m51627b(0, 0);
            this.fastBuffer.m51634a(4, 0L);
            return;
        }
        this.fastBuffer = new FastBuffer(PAGE_SIZE);
    }

    private void clearInvalid() {
        this.invalidBytes = 0;
        this.invalids.clear();
    }

    private boolean commitToCFile() {
        int i = this.writingMode;
        if (i == 1) {
            this.executor.execute(new Runnable() { // from class: com.mbridge.msdk.foundation.tools.FastKV.1
                @Override // java.lang.Runnable
                public final void run() {
                    FastKV.this.writeToCFile();
                }
            });
        } else if (i == 2) {
            return writeToCFile();
        }
        return true;
    }

    private void copyBuffer(MappedByteBuffer mappedByteBuffer, MappedByteBuffer mappedByteBuffer2, int i) {
        FileChannel fileChannel;
        if (mappedByteBuffer.capacity() != mappedByteBuffer2.capacity()) {
            try {
                if (mappedByteBuffer2 == this.bBuffer) {
                    fileChannel = this.bChannel;
                } else {
                    fileChannel = this.aChannel;
                }
                MappedByteBuffer map = fileChannel.map(FileChannel.MapMode.READ_WRITE, 0L, mappedByteBuffer.capacity());
                map.order(ByteOrder.LITTLE_ENDIAN);
                if (mappedByteBuffer2 == this.bBuffer) {
                    this.bBuffer = map;
                } else {
                    this.aBuffer = map;
                }
                mappedByteBuffer2 = map;
            } catch (IOException e) {
                error(e);
                toBlockingMode();
                return;
            }
        }
        mappedByteBuffer.rewind();
        mappedByteBuffer2.rewind();
        mappedByteBuffer.limit(i);
        mappedByteBuffer2.put(mappedByteBuffer);
        mappedByteBuffer.limit(mappedByteBuffer.capacity());
    }

    private void countInvalid(int i, int i2) {
        this.invalidBytes += i2 - i;
        this.invalids.add(new C22023c(i, i2));
    }

    private void deleteCFiles() {
        try {
            String str = this.path;
            C22048ar.m51684a(new File(str, this.name + C_SUFFIX));
            String str2 = this.path;
            C22048ar.m51684a(new File(str2, this.name + TEMP_SUFFIX));
        } catch (Exception e) {
            error(e);
        }
    }

    private void ensureSize(int i) {
        int length = this.fastBuffer.f57016a.length;
        int i2 = this.dataEnd + i;
        if (i2 >= length) {
            int i3 = this.invalidBytes;
            if (i3 > i && i3 > bytesThreshold()) {
                m51930gc(i);
                return;
            }
            int newCapacity = getNewCapacity(length, i2);
            byte[] bArr = new byte[newCapacity];
            System.arraycopy(this.fastBuffer.f57016a, 0, bArr, 0, this.dataEnd);
            this.fastBuffer.f57016a = bArr;
            if (this.writingMode == 0) {
                try {
                    long j = newCapacity;
                    MappedByteBuffer map = this.aChannel.map(FileChannel.MapMode.READ_WRITE, 0L, j);
                    this.aBuffer = map;
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    map.order(byteOrder);
                    MappedByteBuffer map2 = this.bChannel.map(FileChannel.MapMode.READ_WRITE, 0L, j);
                    this.bBuffer = map2;
                    map2.order(byteOrder);
                } catch (IOException e) {
                    error(new Exception(MAP_FAILED, e));
                    this.fastBuffer.m51627b(0, this.dataEnd - 12);
                    this.fastBuffer.m51634a(4, this.checksum);
                    toBlockingMode();
                }
            }
        }
    }

    private void error(Exception exc) {
        InterfaceC22022b interfaceC22022b = this.logger;
        if (interfaceC22022b != null) {
            interfaceC22022b.mo51621a(this.name, exc);
        }
    }

    private void fastPutString(String str, String str2, Container.C22063i c22063i) {
        int m51632a = FastBuffer.m51632a(str2);
        if (c22063i == null) {
            int m51632a2 = FastBuffer.m51632a(str);
            checkKeySize(m51632a2);
            int i = m51632a2 + 4;
            this.updateSize = i + m51632a;
            preparePutBytes();
            this.fastBuffer.m51637a((byte) 6);
            putKey(str, m51632a2);
            putStringValue(str2, m51632a);
            Map<String, Container.AbstractC22056b> map = this.data;
            int i2 = this.updateStart;
            map.put(str, new Container.C22063i(i2, i2 + i, str2, m51632a, false));
            updateChange();
        } else {
            int i3 = c22063i.f56993a;
            int i4 = i3 - c22063i.f57000c;
            int i5 = c22063i.f57002e;
            boolean z = false;
            String str3 = null;
            if (i5 == m51632a) {
                this.checksum ^= this.fastBuffer.m51635a(i3, i5);
                if (m51632a == str2.length()) {
                    str2.getBytes(0, m51632a, this.fastBuffer.f57016a, c22063i.f56993a);
                } else {
                    FastBuffer fastBuffer = this.fastBuffer;
                    fastBuffer.f57017b = c22063i.f56993a;
                    fastBuffer.m51626b(str2);
                }
                this.updateStart = c22063i.f56993a;
                this.updateSize = m51632a;
            } else {
                this.updateSize = i4 + m51632a;
                preparePutBytes();
                this.fastBuffer.m51637a((byte) 6);
                int i6 = i4 - 3;
                FastBuffer fastBuffer2 = this.fastBuffer;
                byte[] bArr = fastBuffer2.f57016a;
                System.arraycopy(bArr, c22063i.f57000c + 1, bArr, fastBuffer2.f57017b, i6);
                this.fastBuffer.f57017b += i6;
                putStringValue(str2, m51632a);
                remove((byte) 6, c22063i.f57000c, c22063i.f56993a + c22063i.f57002e);
                if (c22063i.f56999b) {
                    str3 = (String) c22063i.f57001d;
                }
                c22063i.f56999b = false;
                int i7 = this.updateStart;
                c22063i.f57000c = i7;
                c22063i.f56993a = i7 + i4;
                c22063i.f57002e = m51632a;
                z = true;
            }
            c22063i.f57001d = str2;
            updateChange();
            if (z) {
                checkGC();
            }
            if (str3 != null) {
                C22048ar.m51684a(new File(this.path + this.name, str3));
            }
        }
        checkIfCommit();
    }

    private byte[] getArrayFromFile(Container.C22055a c22055a) {
        try {
            byte[] m51680b = C22048ar.m51680b(new File(this.path + this.name, (String) c22055a.f57001d));
            if (m51680b == null) {
                return EMPTY_ARRAY;
            }
            return m51680b;
        } catch (Exception e) {
            error(e);
            return EMPTY_ARRAY;
        }
    }

    private int getNewCapacity(int i, int i2) {
        if (i2 <= 536870912) {
            int i3 = PAGE_SIZE;
            if (i2 <= i3) {
                return i3;
            }
            while (i < i2) {
                int i4 = DOUBLE_LIMIT;
                if (i <= i4) {
                    i <<= 1;
                } else {
                    i += i4;
                }
            }
            return i;
        }
        throw new IllegalStateException("data size out of limit");
    }

    private Object getObjectFromFile(Container.C22062h c22062h) {
        try {
            byte[] m51680b = C22048ar.m51680b(new File(this.path + this.name, (String) c22062h.f57001d));
            if (m51680b != null) {
                int i = m51680b[0] & 255;
                String str = new String(m51680b, 1, i, StandardCharsets.UTF_8);
                InterfaceC22021a interfaceC22021a = this.encoderMap.get(str);
                if (interfaceC22021a != null) {
                    int i2 = i + 1;
                    return interfaceC22021a.mo51694a(m51680b, i2, m51680b.length - i2);
                }
                warning(new Exception("No encoder for tag:" + str));
                return null;
            }
            warning(new Exception("Read object data failed"));
            return null;
        } catch (Exception e) {
            error(e);
            return null;
        }
    }

    private String getStringFromFile(Container.C22063i c22063i) {
        try {
            byte[] m51680b = C22048ar.m51680b(new File(this.path + this.name, (String) c22063i.f57001d));
            if (m51680b != null && m51680b.length != 0) {
                return new String(m51680b, StandardCharsets.UTF_8);
            }
            return "";
        } catch (Exception e) {
            error(e);
        }
        return "";
    }

    private void info(String str) {
        InterfaceC22022b interfaceC22022b = this.logger;
        if (interfaceC22022b != null) {
            interfaceC22022b.mo51620a(this.name, str);
        }
    }

    private boolean isABFileEqual() {
        FastBuffer fastBuffer = new FastBuffer(this.dataEnd);
        this.bBuffer.rewind();
        this.bBuffer.get(fastBuffer.f57016a, 0, this.dataEnd);
        byte[] bArr = this.fastBuffer.f57016a;
        byte[] bArr2 = fastBuffer.f57016a;
        for (int i = 0; i < this.dataEnd; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    private synchronized void loadData() {
        long nanoTime = System.nanoTime();
        if (!loadFromCFile() && this.writingMode == 0) {
            loadFromABFile();
        }
        if (this.fastBuffer == null) {
            this.fastBuffer = new FastBuffer(PAGE_SIZE);
        }
        if (this.logger != null) {
            info("loading finish, data len:" + this.dataEnd + ", get keys:" + this.data.size() + ", use time:" + ((System.nanoTime() - nanoTime) / 1000000) + " ms");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0192 A[Catch: Exception -> 0x01b4, TryCatch #0 {Exception -> 0x01b4, blocks: (B:3:0x0038, B:5:0x003e, B:8:0x0046, B:9:0x0064, B:13:0x0075, B:17:0x0090, B:18:0x009d, B:21:0x00b0, B:22:0x00b4, B:24:0x00d2, B:26:0x00db, B:28:0x00fb, B:30:0x0101, B:35:0x010e, B:37:0x0114, B:39:0x012b, B:41:0x0131, B:43:0x014a, B:44:0x0157, B:46:0x0173, B:48:0x0179, B:51:0x0192, B:16:0x008b, B:12:0x0072, B:53:0x019c, B:55:0x01a6), top: B:60:0x0038, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void loadFromABFile() {
        /*
            Method dump skipped, instructions count: 447
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.FastKV.loadFromABFile():void");
    }

    private boolean loadFromCFile() {
        File file = new File(this.path, this.name + C_SUFFIX);
        File file2 = new File(this.path, this.name + TEMP_SUFFIX);
        boolean z = false;
        try {
            if (!file.exists()) {
                if (file2.exists()) {
                    file = file2;
                } else {
                    file = null;
                }
            }
            if (file != null) {
                if (loadWithBlockingIO(file)) {
                    if (this.writingMode != 0) {
                        return false;
                    }
                    if (writeToABFile(this.fastBuffer)) {
                        info("recover from c file");
                        try {
                            deleteCFiles();
                            return true;
                        } catch (Exception e) {
                            e = e;
                            z = true;
                            error(e);
                            return z;
                        }
                    }
                    this.writingMode = 1;
                    return false;
                }
                clearData();
                deleteCFiles();
                return false;
            } else if (this.writingMode == 0) {
                return false;
            } else {
                File file3 = new File(this.path, this.name + A_SUFFIX);
                File file4 = new File(this.path, this.name + B_SUFFIX);
                if (!file3.exists() || !file4.exists()) {
                    return false;
                }
                tryBlockingIO(file3, file4);
                return false;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    private boolean loadWithBlockingIO(File file) throws IOException {
        long length = file.length();
        if (length != 0 && length <= 536870912) {
            int i = (int) length;
            int newCapacity = getNewCapacity(PAGE_SIZE, i);
            FastBuffer fastBuffer = this.fastBuffer;
            if (fastBuffer != null && fastBuffer.f57016a.length == newCapacity) {
                fastBuffer.f57017b = 0;
            } else {
                fastBuffer = new FastBuffer(new byte[newCapacity]);
                this.fastBuffer = fastBuffer;
            }
            C22048ar.m51682a(file, fastBuffer.f57016a, i);
            int m51625c = fastBuffer.m51625c();
            long m51629b = fastBuffer.m51629b();
            this.dataEnd = m51625c + 12;
            if (m51625c >= 0 && m51625c <= i - 12 && m51629b == fastBuffer.m51635a(12, m51625c) && parseData() == 0) {
                this.checksum = m51629b;
                return true;
            }
        }
        return false;
    }

    private void mergeInvalids() {
        int size = this.invalids.size() - 1;
        C22023c c22023c = this.invalids.get(size);
        while (size > 0) {
            size--;
            C22023c c22023c2 = this.invalids.get(size);
            if (c22023c.f56828b == c22023c2.f56827a) {
                c22023c2.f56827a = c22023c.f56827a;
                this.invalids.remove(size + 1);
            }
            c22023c = c22023c2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x017c, code lost:
        throw new java.lang.Exception(com.mbridge.msdk.foundation.tools.FastKV.PARSE_DATA_FAILED);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int parseData() {
        /*
            Method dump skipped, instructions count: 398
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.FastKV.parseData():int");
    }

    private void preparePutBytes() {
        ensureSize(this.updateSize);
        int i = this.dataEnd;
        this.updateStart = i;
        this.dataEnd = this.updateSize + i;
        this.fastBuffer.f57017b = i;
        this.sizeChanged = true;
    }

    private void putKey(String str, int i) {
        this.fastBuffer.m51637a((byte) i);
        if (i == str.length()) {
            FastBuffer fastBuffer = this.fastBuffer;
            str.getBytes(0, i, fastBuffer.f57016a, fastBuffer.f57017b);
            this.fastBuffer.f57017b += i;
            return;
        }
        this.fastBuffer.m51626b(str);
    }

    private void putStringValue(String str, int i) {
        this.fastBuffer.m51631a((short) i);
        if (i == str.length()) {
            FastBuffer fastBuffer = this.fastBuffer;
            str.getBytes(0, i, fastBuffer.f57016a, fastBuffer.f57017b);
            return;
        }
        this.fastBuffer.m51626b(str);
    }

    private void resetBuffer(MappedByteBuffer mappedByteBuffer) throws IOException {
        FileChannel fileChannel;
        int capacity = mappedByteBuffer.capacity();
        int i = PAGE_SIZE;
        if (capacity != i) {
            if (mappedByteBuffer == this.aBuffer) {
                fileChannel = this.aChannel;
            } else {
                fileChannel = this.bChannel;
            }
            FileChannel fileChannel2 = fileChannel;
            fileChannel2.truncate(i);
            MappedByteBuffer map = fileChannel2.map(FileChannel.MapMode.READ_WRITE, 0L, i);
            map.order(ByteOrder.LITTLE_ENDIAN);
            if (mappedByteBuffer == this.aBuffer) {
                this.aBuffer = map;
            } else {
                this.bBuffer = map;
            }
            mappedByteBuffer = map;
        }
        mappedByteBuffer.putInt(0, 0);
        mappedByteBuffer.putLong(4, 0L);
    }

    private void resetData() {
        if (this.writingMode == 0) {
            try {
                resetBuffer(this.aBuffer);
                resetBuffer(this.bBuffer);
            } catch (IOException unused) {
                toBlockingMode();
            }
        }
        clearData();
        C22048ar.m51684a(new File(this.path + this.name));
    }

    private int saveArray(String str, byte[] bArr, byte b) {
        this.tempExternalName = null;
        if (bArr.length < 2048) {
            return wrapArray(str, bArr, b);
        }
        info("large value, key: " + str + ", size: " + bArr.length);
        String m51681b = C22048ar.m51681b();
        if (C22048ar.m51683a(new File(this.path + this.name, m51681b), bArr)) {
            this.tempExternalName = m51681b;
            byte[] bArr2 = new byte[32];
            m51681b.getBytes(0, 32, bArr2, 0);
            return wrapArray(str, bArr2, (byte) (b | SignedBytes.MAX_POWER_OF_TWO));
        }
        error("save large value failed");
        return 0;
    }

    private long shiftCheckSum(long j, int i) {
        int i2 = (i & 7) << 3;
        return (j >>> (64 - i2)) | (j << i2);
    }

    private void syncABBuffer(MappedByteBuffer mappedByteBuffer) {
        if (this.sizeChanged && mappedByteBuffer != this.aBuffer) {
            mappedByteBuffer.putInt(0, this.dataEnd - 12);
        }
        mappedByteBuffer.putLong(4, this.checksum);
        int i = this.removeStart;
        if (i != 0) {
            mappedByteBuffer.put(i, this.fastBuffer.f57016a[i]);
        }
        if (this.updateSize != 0) {
            mappedByteBuffer.position(this.updateStart);
            mappedByteBuffer.put(this.fastBuffer.f57016a, this.updateStart, this.updateSize);
        }
    }

    private void toBlockingMode() {
        this.writingMode = 1;
        C22048ar.m51685a(this.aChannel);
        C22048ar.m51685a(this.bChannel);
        this.aChannel = null;
        this.bChannel = null;
        this.aBuffer = null;
        this.bBuffer = null;
    }

    private void truncate(int i) {
        int i2 = PAGE_SIZE;
        int newCapacity = getNewCapacity(i2, i + i2);
        byte[] bArr = this.fastBuffer.f57016a;
        if (newCapacity >= bArr.length) {
            return;
        }
        byte[] bArr2 = new byte[newCapacity];
        System.arraycopy(bArr, 0, bArr2, 0, this.dataEnd);
        this.fastBuffer.f57016a = bArr2;
        if (this.writingMode == 0) {
            try {
                long j = newCapacity;
                this.aChannel.truncate(j);
                MappedByteBuffer map = this.aChannel.map(FileChannel.MapMode.READ_WRITE, 0L, j);
                this.aBuffer = map;
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                map.order(byteOrder);
                this.bChannel.truncate(j);
                MappedByteBuffer map2 = this.bChannel.map(FileChannel.MapMode.READ_WRITE, 0L, j);
                this.bBuffer = map2;
                map2.order(byteOrder);
            } catch (IOException e) {
                error(new Exception(MAP_FAILED, e));
                toBlockingMode();
            }
        }
        info(TRUNCATE_FINISH);
    }

    private void tryBlockingIO(File file, File file2) {
        try {
            if (loadWithBlockingIO(file)) {
                return;
            }
        } catch (IOException e) {
            warning(e);
        }
        clearData();
        try {
            if (loadWithBlockingIO(file2)) {
                return;
            }
        } catch (IOException e2) {
            warning(e2);
        }
        clearData();
    }

    private void updateBoolean(byte b, int i) {
        long shiftCheckSum = this.checksum ^ shiftCheckSum(1L, i);
        this.checksum = shiftCheckSum;
        if (this.writingMode == 0) {
            this.aBuffer.putLong(4, shiftCheckSum);
            this.aBuffer.put(i, b);
            this.bBuffer.putLong(4, this.checksum);
            this.bBuffer.put(i, b);
        } else {
            this.fastBuffer.m51634a(4, shiftCheckSum);
        }
        this.fastBuffer.f57016a[i] = b;
    }

    private void updateBytes(int i, byte[] bArr) {
        int length = bArr.length;
        this.checksum ^= this.fastBuffer.m51635a(i, length);
        FastBuffer fastBuffer = this.fastBuffer;
        fastBuffer.f57017b = i;
        fastBuffer.m51630a(bArr);
        long m51635a = this.checksum ^ this.fastBuffer.m51635a(i, length);
        this.checksum = m51635a;
        if (this.writingMode == 0) {
            this.aBuffer.putInt(0, -1);
            this.aBuffer.putLong(4, this.checksum);
            this.aBuffer.position(i);
            this.aBuffer.put(bArr);
            this.aBuffer.putInt(0, this.dataEnd - 12);
            this.bBuffer.putLong(4, this.checksum);
            this.bBuffer.position(i);
            this.bBuffer.put(bArr);
            return;
        }
        this.fastBuffer.m51634a(4, m51635a);
    }

    private void updateChange() {
        this.checksum ^= this.fastBuffer.m51635a(this.updateStart, this.updateSize);
        if (this.writingMode == 0) {
            this.aBuffer.putInt(0, -1);
            syncABBuffer(this.aBuffer);
            this.aBuffer.putInt(0, this.dataEnd - 12);
            syncABBuffer(this.bBuffer);
        } else {
            if (this.sizeChanged) {
                this.fastBuffer.m51627b(0, this.dataEnd - 12);
            }
            this.fastBuffer.m51634a(4, this.checksum);
        }
        this.sizeChanged = false;
        this.removeStart = 0;
        this.updateSize = 0;
    }

    private void updateInt32(int i, long j, int i2) {
        long shiftCheckSum = shiftCheckSum(j, i2) ^ this.checksum;
        this.checksum = shiftCheckSum;
        if (this.writingMode == 0) {
            this.aBuffer.putLong(4, shiftCheckSum);
            this.aBuffer.putInt(i2, i);
            this.bBuffer.putLong(4, this.checksum);
            this.bBuffer.putInt(i2, i);
        } else {
            this.fastBuffer.m51634a(4, shiftCheckSum);
        }
        this.fastBuffer.m51627b(i2, i);
    }

    private void updateInt64(long j, long j2, int i) {
        long shiftCheckSum = shiftCheckSum(j2, i) ^ this.checksum;
        this.checksum = shiftCheckSum;
        if (this.writingMode == 0) {
            this.aBuffer.putLong(4, shiftCheckSum);
            this.aBuffer.putLong(i, j);
            this.bBuffer.putLong(4, this.checksum);
            this.bBuffer.putLong(i, j);
        } else {
            this.fastBuffer.m51634a(4, shiftCheckSum);
        }
        this.fastBuffer.m51634a(i, j);
    }

    private void updateObject(String str, Object obj, byte[] bArr, Container.AbstractC22064j abstractC22064j) {
        String str2;
        boolean z;
        int saveArray = saveArray(str, bArr, abstractC22064j.mo51650a());
        if (saveArray != 0) {
            if (abstractC22064j.f56999b) {
                str2 = (String) abstractC22064j.f57001d;
            } else {
                str2 = null;
            }
            remove(abstractC22064j.mo51650a(), abstractC22064j.f57000c, abstractC22064j.f56993a + abstractC22064j.f57002e);
            String str3 = this.tempExternalName;
            if (str3 != null) {
                z = true;
            } else {
                z = false;
            }
            abstractC22064j.f57000c = this.updateStart;
            abstractC22064j.f56993a = saveArray;
            abstractC22064j.f56999b = z;
            if (z) {
                abstractC22064j.f57001d = str3;
                abstractC22064j.f57002e = 32;
                this.tempExternalName = null;
            } else {
                abstractC22064j.f57001d = obj;
                abstractC22064j.f57002e = bArr.length;
            }
            updateChange();
            checkGC();
            if (str2 != null) {
                C22048ar.m51684a(new File(this.path + this.name, str2));
            }
        }
    }

    private void updateOffset(int i, int[] iArr) {
        for (Container.AbstractC22056b abstractC22056b : this.data.values()) {
            int i2 = abstractC22056b.f56993a;
            if (i2 > i) {
                int length = (iArr.length >> 1) - 1;
                int i3 = 0;
                while (true) {
                    if (i3 > length) {
                        break;
                    }
                    int i4 = (i3 + length) >>> 1;
                    int i5 = iArr[i4 << 1];
                    if (i5 < i2) {
                        i3 = i4 + 1;
                    } else if (i5 <= i2) {
                        length = i4;
                        break;
                    } else {
                        length = i4 - 1;
                    }
                }
                int i6 = iArr[(length << 1) + 1];
                abstractC22056b.f56993a -= i6;
                if (abstractC22056b.mo51650a() >= 6) {
                    ((Container.AbstractC22064j) abstractC22056b).f57000c -= i6;
                }
            }
        }
    }

    private void warning(Exception exc) {
        InterfaceC22022b interfaceC22022b = this.logger;
        if (interfaceC22022b != null) {
            interfaceC22022b.mo51619b(this.name, exc);
        }
    }

    private int wrapArray(String str, byte[] bArr, byte b) {
        wrapHeader(str, b, bArr.length + 2);
        this.fastBuffer.m51631a((short) bArr.length);
        FastBuffer fastBuffer = this.fastBuffer;
        int i = fastBuffer.f57017b;
        fastBuffer.m51630a(bArr);
        return i;
    }

    private void wrapHeader(String str, byte b) {
        wrapHeader(str, b, TYPE_SIZE[b]);
    }

    private boolean writeToABFile(FastBuffer fastBuffer) {
        int length = fastBuffer.f57016a.length;
        File file = new File(this.path, this.name + A_SUFFIX);
        File file2 = new File(this.path, this.name + B_SUFFIX);
        try {
            if (C22048ar.m51679c(file) && C22048ar.m51679c(file2)) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file2, "rw");
                long j = length;
                randomAccessFile.setLength(j);
                randomAccessFile2.setLength(j);
                this.aChannel = randomAccessFile.getChannel();
                this.bChannel = randomAccessFile2.getChannel();
                MappedByteBuffer map = this.aChannel.map(FileChannel.MapMode.READ_WRITE, 0L, j);
                this.aBuffer = map;
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                map.order(byteOrder);
                MappedByteBuffer map2 = this.bChannel.map(FileChannel.MapMode.READ_WRITE, 0L, j);
                this.bBuffer = map2;
                map2.order(byteOrder);
                this.aBuffer.put(fastBuffer.f57016a, 0, this.dataEnd);
                this.bBuffer.put(fastBuffer.f57016a, 0, this.dataEnd);
                return true;
            }
            throw new Exception(OPEN_FILE_FAILED);
        } catch (Exception e) {
            error(e);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean writeToCFile() {
        try {
            String str = this.path;
            File file = new File(str, this.name + TEMP_SUFFIX);
            if (C22048ar.m51679c(file)) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                randomAccessFile.setLength(this.dataEnd);
                randomAccessFile.write(this.fastBuffer.f57016a, 0, this.dataEnd);
                randomAccessFile.close();
                String str2 = this.path;
                File file2 = new File(str2, this.name + C_SUFFIX);
                if (!file2.exists() || file2.delete()) {
                    if (file.renameTo(file2)) {
                        return true;
                    }
                    warning(new Exception("rename failed"));
                }
            }
        } catch (Exception e) {
            error(e);
        }
        return false;
    }

    public synchronized void clear() {
        resetData();
        if (this.writingMode != 0) {
            deleteCFiles();
        }
    }

    public synchronized boolean commit() {
        this.autoCommit = true;
        return commitToCFile();
    }

    public synchronized boolean contains(String str) {
        return this.data.containsKey(str);
    }

    public synchronized void disableAutoCommit() {
        this.autoCommit = false;
    }

    public synchronized void force() {
        if (this.writingMode == 0) {
            this.aBuffer.force();
            this.bBuffer.force();
        }
    }

    /* renamed from: gc */
    void m51930gc(int i) {
        boolean z;
        int i2;
        Collections.sort(this.invalids);
        mergeInvalids();
        C22023c c22023c = this.invalids.get(0);
        int i3 = c22023c.f56828b;
        int i4 = this.dataEnd;
        int i5 = i4 - this.invalidBytes;
        int i6 = i5 - 12;
        int i7 = i5 - i3;
        int i8 = i4 - i3;
        if (i6 < i8 + i7) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.checksum ^= this.fastBuffer.m51635a(i3, i8);
        }
        int size = this.invalids.size();
        int i9 = size - 1;
        int i10 = this.dataEnd - this.invalids.get(i9).f56827a;
        if (i10 > 0) {
            i2 = size;
        } else {
            i2 = i9;
        }
        int[] iArr = new int[i2 << 1];
        int i11 = c22023c.f56828b;
        int i12 = c22023c.f56827a;
        for (int i13 = 1; i13 < size; i13++) {
            C22023c c22023c2 = this.invalids.get(i13);
            int i14 = c22023c2.f56828b - i12;
            byte[] bArr = this.fastBuffer.f57016a;
            System.arraycopy(bArr, i12, bArr, i11, i14);
            int i15 = (i13 - 1) << 1;
            iArr[i15] = i12;
            iArr[i15 + 1] = i12 - i11;
            i11 += i14;
            i12 = c22023c2.f56827a;
        }
        if (i10 > 0) {
            byte[] bArr2 = this.fastBuffer.f57016a;
            System.arraycopy(bArr2, i12, bArr2, i11, i10);
            int i16 = i9 << 1;
            iArr[i16] = i12;
            iArr[i16 + 1] = i12 - i11;
        }
        clearInvalid();
        if (z) {
            this.checksum = this.fastBuffer.m51635a(12, i6);
        } else {
            this.checksum ^= this.fastBuffer.m51635a(i3, i7);
        }
        this.dataEnd = i5;
        if (this.writingMode == 0) {
            this.aBuffer.putInt(0, -1);
            this.aBuffer.putLong(4, this.checksum);
            this.aBuffer.position(i3);
            this.aBuffer.put(this.fastBuffer.f57016a, i3, i7);
            this.aBuffer.putInt(0, i6);
            this.bBuffer.putInt(0, i6);
            this.bBuffer.putLong(4, this.checksum);
            this.bBuffer.position(i3);
            this.bBuffer.put(this.fastBuffer.f57016a, i3, i7);
        } else {
            this.fastBuffer.m51627b(0, i6);
            this.fastBuffer.m51634a(4, this.checksum);
        }
        updateOffset(i3, iArr);
        int i17 = i5 + i;
        if (this.fastBuffer.f57016a.length - i17 > TRUNCATE_THRESHOLD) {
            truncate(i17);
        }
        info(GC_FINISH);
    }

    public synchronized Map<String, Object> getAll() {
        Object valueOf;
        int size = this.data.size();
        if (size == 0) {
            return new HashMap();
        }
        HashMap hashMap = new HashMap(((size * 4) / 3) + 1);
        for (Map.Entry<String, Container.AbstractC22056b> entry : this.data.entrySet()) {
            String key = entry.getKey();
            Container.AbstractC22056b value = entry.getValue();
            switch (value.mo51650a()) {
                case 1:
                    valueOf = Boolean.valueOf(((Container.C22057c) value).f56994b);
                    break;
                case 2:
                    valueOf = Integer.valueOf(((Container.C22060f) value).f56997b);
                    break;
                case 3:
                    valueOf = Float.valueOf(((Container.C22059e) value).f56996b);
                    break;
                case 4:
                    valueOf = Long.valueOf(((Container.C22061g) value).f56998b);
                    break;
                case 5:
                    valueOf = Double.valueOf(((Container.C22058d) value).f56995b);
                    break;
                case 6:
                    Container.C22063i c22063i = (Container.C22063i) value;
                    if (c22063i.f56999b) {
                        valueOf = getStringFromFile(c22063i);
                        break;
                    } else {
                        valueOf = c22063i.f57001d;
                        break;
                    }
                case 7:
                    Container.C22055a c22055a = (Container.C22055a) value;
                    if (c22055a.f56999b) {
                        valueOf = getArrayFromFile(c22055a);
                        break;
                    } else {
                        valueOf = c22055a.f57001d;
                        break;
                    }
                case 8:
                    Container.C22062h c22062h = (Container.C22062h) value;
                    if (c22062h.f56999b) {
                        valueOf = getObjectFromFile(c22062h);
                        break;
                    } else {
                        valueOf = ((Container.C22062h) value).f57001d;
                        break;
                    }
                default:
                    valueOf = null;
                    break;
            }
            hashMap.put(key, valueOf);
        }
        return hashMap;
    }

    public byte[] getArray(String str) {
        return getArray(str, EMPTY_ARRAY);
    }

    public synchronized boolean getBoolean(String str) {
        return getBoolean(str, false);
    }

    public double getDouble(String str) {
        return getDouble(str, 0.0d);
    }

    public float getFloat(String str) {
        return getFloat(str, 0.0f);
    }

    public int getInt(String str) {
        return getInt(str, 0);
    }

    public synchronized long getLong(String str) {
        Container.C22061g c22061g;
        c22061g = (Container.C22061g) this.data.get(str);
        return c22061g == null ? 0L : c22061g.f56998b;
    }

    public synchronized <T> T getObject(String str) {
        T t;
        Container.C22062h c22062h = (Container.C22062h) this.data.get(str);
        if (c22062h != null) {
            if (c22062h.f56999b) {
                t = (T) getObjectFromFile(c22062h);
            } else {
                t = (T) c22062h.f57001d;
            }
            return t;
        }
        return null;
    }

    public String getString(String str) {
        return getString(str, "");
    }

    public synchronized Set<String> getStringSet(String str) {
        return (Set) getObject(str);
    }

    public void putAll(Map<String, Object> map) {
        putAll(map, null);
    }

    public synchronized void putArray(String str, byte[] bArr) {
        checkKey(str);
        if (bArr == null) {
            remove(str);
        } else {
            addOrUpdate(str, bArr, bArr, (Container.C22055a) this.data.get(str), (byte) 7);
        }
    }

    public synchronized void putBoolean(String str, boolean z) {
        checkKey(str);
        Container.C22057c c22057c = (Container.C22057c) this.data.get(str);
        int i = 0;
        if (c22057c == null) {
            wrapHeader(str, (byte) 1);
            FastBuffer fastBuffer = this.fastBuffer;
            int i2 = fastBuffer.f57017b;
            if (z) {
                i = 1;
            }
            fastBuffer.m51637a((byte) i);
            updateChange();
            this.data.put(str, new Container.C22057c(i2, z));
            checkIfCommit();
        } else if (c22057c.f56994b != z) {
            c22057c.f56994b = z;
            if (z) {
                i = 1;
            }
            updateBoolean((byte) i, c22057c.f56993a);
            checkIfCommit();
        }
    }

    public synchronized void putDouble(String str, double d) {
        checkKey(str);
        Container.C22058d c22058d = (Container.C22058d) this.data.get(str);
        if (c22058d == null) {
            wrapHeader(str, (byte) 5);
            FastBuffer fastBuffer = this.fastBuffer;
            int i = fastBuffer.f57017b;
            fastBuffer.m51633a(Double.doubleToRawLongBits(d));
            updateChange();
            this.data.put(str, new Container.C22058d(i, d));
            checkIfCommit();
        } else if (c22058d.f56995b != d) {
            long doubleToRawLongBits = Double.doubleToRawLongBits(d);
            c22058d.f56995b = d;
            updateInt64(doubleToRawLongBits, Double.doubleToRawLongBits(c22058d.f56995b) ^ doubleToRawLongBits, c22058d.f56993a);
            checkIfCommit();
        }
    }

    public synchronized void putFloat(String str, float f) {
        checkKey(str);
        Container.C22059e c22059e = (Container.C22059e) this.data.get(str);
        if (c22059e == null) {
            wrapHeader(str, (byte) 3);
            FastBuffer fastBuffer = this.fastBuffer;
            int i = fastBuffer.f57017b;
            fastBuffer.m51628b(Float.floatToRawIntBits(f));
            updateChange();
            this.data.put(str, new Container.C22059e(i, f));
            checkIfCommit();
        } else if (c22059e.f56996b != f) {
            int floatToRawIntBits = Float.floatToRawIntBits(f);
            c22059e.f56996b = f;
            updateInt32(floatToRawIntBits, (Float.floatToRawIntBits(c22059e.f56996b) ^ floatToRawIntBits) & 4294967295L, c22059e.f56993a);
            checkIfCommit();
        }
    }

    public synchronized void putInt(String str, int i) {
        checkKey(str);
        Container.C22060f c22060f = (Container.C22060f) this.data.get(str);
        if (c22060f == null) {
            wrapHeader(str, (byte) 2);
            FastBuffer fastBuffer = this.fastBuffer;
            int i2 = fastBuffer.f57017b;
            fastBuffer.m51628b(i);
            updateChange();
            this.data.put(str, new Container.C22060f(i2, i));
            checkIfCommit();
        } else {
            int i3 = c22060f.f56997b;
            if (i3 != i) {
                c22060f.f56997b = i;
                updateInt32(i, (i3 ^ i) & 4294967295L, c22060f.f56993a);
                checkIfCommit();
            }
        }
    }

    public synchronized void putLong(String str, long j) {
        checkKey(str);
        Container.C22061g c22061g = (Container.C22061g) this.data.get(str);
        if (c22061g == null) {
            wrapHeader(str, (byte) 4);
            FastBuffer fastBuffer = this.fastBuffer;
            int i = fastBuffer.f57017b;
            fastBuffer.m51633a(j);
            updateChange();
            this.data.put(str, new Container.C22061g(i, j));
            checkIfCommit();
        } else {
            long j2 = c22061g.f56998b;
            if (j2 != j) {
                c22061g.f56998b = j;
                updateInt64(j, j ^ j2, c22061g.f56993a);
                checkIfCommit();
            }
        }
    }

    public synchronized <T> void putObject(String str, T t, InterfaceC22021a<T> interfaceC22021a) {
        byte[] bArr;
        checkKey(str);
        if (interfaceC22021a != null) {
            String mo51696a = interfaceC22021a.mo51696a();
            if (mo51696a != null && !mo51696a.isEmpty() && mo51696a.length() <= 50) {
                if (this.encoderMap.containsKey(mo51696a)) {
                    if (t == null) {
                        remove(str);
                        return;
                    }
                    try {
                        bArr = interfaceC22021a.mo51695a(t);
                    } catch (Exception e) {
                        error(e);
                        bArr = null;
                    }
                    if (bArr == null) {
                        remove(str);
                        return;
                    }
                    int m51632a = FastBuffer.m51632a(mo51696a);
                    FastBuffer fastBuffer = new FastBuffer(m51632a + 1 + bArr.length);
                    fastBuffer.m51637a((byte) m51632a);
                    fastBuffer.m51626b(mo51696a);
                    fastBuffer.m51630a(bArr);
                    addOrUpdate(str, t, fastBuffer.f57016a, (Container.C22062h) this.data.get(str), (byte) 8);
                    return;
                }
                throw new IllegalArgumentException("Encoder hasn't been registered");
            }
            throw new IllegalArgumentException("Invalid encoder tag:" + mo51696a);
        }
        throw new IllegalArgumentException("Encoder is null");
    }

    public synchronized void putString(String str, String str2) {
        byte[] bytes;
        checkKey(str);
        if (str2 == null) {
            remove(str);
        } else {
            Container.C22063i c22063i = (Container.C22063i) this.data.get(str);
            if (str2.length() * 3 < 2048) {
                fastPutString(str, str2, c22063i);
            } else {
                if (str2.isEmpty()) {
                    bytes = EMPTY_ARRAY;
                } else {
                    bytes = str2.getBytes(StandardCharsets.UTF_8);
                }
                addOrUpdate(str, str2, bytes, c22063i, (byte) 6);
            }
        }
    }

    public synchronized void putStringSet(String str, Set<String> set) {
        if (set == null) {
            remove(str);
        } else {
            putObject(str, set, StringSetEncoder.f56947a);
        }
    }

    public synchronized void remove(String str) {
        Container.AbstractC22056b abstractC22056b = this.data.get(str);
        if (abstractC22056b != null) {
            this.data.remove(str);
            byte mo51650a = abstractC22056b.mo51650a();
            String str2 = null;
            if (mo51650a <= 5) {
                int m51632a = FastBuffer.m51632a(str);
                int i = abstractC22056b.f56993a;
                remove(mo51650a, i - (m51632a + 2), i + TYPE_SIZE[mo51650a]);
            } else {
                Container.AbstractC22064j abstractC22064j = (Container.AbstractC22064j) abstractC22056b;
                remove(mo51650a, abstractC22064j.f57000c, abstractC22064j.f56993a + abstractC22064j.f57002e);
                if (abstractC22064j.f56999b) {
                    str2 = (String) abstractC22064j.f57001d;
                }
            }
            byte b = (byte) (mo51650a | UnsignedBytes.MAX_POWER_OF_TWO);
            if (this.writingMode == 0) {
                this.aBuffer.putLong(4, this.checksum);
                this.aBuffer.put(this.removeStart, b);
                this.bBuffer.putLong(4, this.checksum);
                this.bBuffer.put(this.removeStart, b);
            } else {
                this.fastBuffer.m51634a(4, this.checksum);
            }
            this.removeStart = 0;
            if (str2 != null) {
                C22048ar.m51684a(new File(this.path + this.name, str2));
            }
            checkGC();
            checkIfCommit();
        }
    }

    public synchronized String toString() {
        return "FastKV: path:" + this.path + " name:" + this.name;
    }

    private void wrapHeader(String str, byte b, int i) {
        int m51632a = FastBuffer.m51632a(str);
        checkKeySize(m51632a);
        this.updateSize = m51632a + 2 + i;
        preparePutBytes();
        this.fastBuffer.m51637a(b);
        putKey(str, m51632a);
    }

    public synchronized byte[] getArray(String str, byte[] bArr) {
        Container.C22055a c22055a = (Container.C22055a) this.data.get(str);
        if (c22055a != null) {
            return c22055a.f56999b ? getArrayFromFile(c22055a) : (byte[]) c22055a.f57001d;
        }
        return bArr;
    }

    public synchronized boolean getBoolean(String str, boolean z) {
        Container.C22057c c22057c = (Container.C22057c) this.data.get(str);
        if (c22057c != null) {
            z = c22057c.f56994b;
        }
        return z;
    }

    public synchronized double getDouble(String str, double d) {
        Container.C22058d c22058d = (Container.C22058d) this.data.get(str);
        if (c22058d != null) {
            d = c22058d.f56995b;
        }
        return d;
    }

    public synchronized float getFloat(String str, float f) {
        Container.C22059e c22059e = (Container.C22059e) this.data.get(str);
        if (c22059e != null) {
            f = c22059e.f56996b;
        }
        return f;
    }

    public synchronized int getInt(String str, int i) {
        Container.C22060f c22060f = (Container.C22060f) this.data.get(str);
        if (c22060f != null) {
            i = c22060f.f56997b;
        }
        return i;
    }

    public synchronized String getString(String str, String str2) {
        Container.C22063i c22063i = (Container.C22063i) this.data.get(str);
        if (c22063i != null) {
            return c22063i.f56999b ? getStringFromFile(c22063i) : (String) c22063i.f57001d;
        }
        return str2;
    }

    public synchronized void putAll(Map<String, Object> map, Map<Class, InterfaceC22021a> map2) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (key != null && !key.isEmpty()) {
                if (value instanceof String) {
                    putString(key, (String) value);
                } else if (value instanceof Boolean) {
                    putBoolean(key, ((Boolean) value).booleanValue());
                } else if (value instanceof Integer) {
                    putInt(key, ((Integer) value).intValue());
                } else if (value instanceof Long) {
                    putLong(key, ((Long) value).longValue());
                } else if (value instanceof Float) {
                    putFloat(key, ((Float) value).floatValue());
                } else if (value instanceof Double) {
                    putDouble(key, ((Double) value).doubleValue());
                } else if (value instanceof Set) {
                    Set set = (Set) value;
                    if (!set.isEmpty() && (set.iterator().next() instanceof String)) {
                        putStringSet(key, (Set) value);
                    }
                } else if (value instanceof byte[]) {
                    putArray(key, (byte[]) value);
                } else if (map2 != null) {
                    InterfaceC22021a interfaceC22021a = map2.get(value.getClass());
                    if (interfaceC22021a != null) {
                        putObject(key, value, interfaceC22021a);
                    } else {
                        warning(new Exception("missing encoder for type:" + value.getClass()));
                    }
                } else {
                    warning(new Exception("missing encoders"));
                }
            }
        }
    }

    private void error(String str) {
        InterfaceC22022b interfaceC22022b = this.logger;
        if (interfaceC22022b != null) {
            interfaceC22022b.mo51621a(this.name, new Exception(str));
        }
    }

    public synchronized long getLong(String str, long j) {
        Container.C22061g c22061g = (Container.C22061g) this.data.get(str);
        if (c22061g != null) {
            j = c22061g.f56998b;
        }
        return j;
    }

    private void remove(byte b, int i, int i2) {
        countInvalid(i, i2);
        byte b2 = (byte) (b | UnsignedBytes.MAX_POWER_OF_TWO);
        byte[] bArr = this.fastBuffer.f57016a;
        this.checksum = (((bArr[i] ^ b2) & 255) << ((i & 7) << 3)) ^ this.checksum;
        bArr[i] = b2;
        this.removeStart = i;
    }
}
