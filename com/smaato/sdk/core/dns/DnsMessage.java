package com.smaato.sdk.core.dns;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.util.collections.Lists;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class DnsMessage {

    /* renamed from: a */
    public final int f71481a;
    @NonNull

    /* renamed from: b */
    final ResponseCode f71482b;

    /* renamed from: c */
    final boolean f71483c;
    @Nullable

    /* renamed from: d */
    private final Opcode f71484d;
    @Nullable

    /* renamed from: e */
    private final List<C27094j> f71485e;
    @Nullable

    /* renamed from: f */
    private final List<Record<? extends Data>> f71486f;
    @Nullable

    /* renamed from: g */
    private byte[] f71487g;
    @Nullable

    /* renamed from: h */
    private String f71488h;
    @Nullable

    /* renamed from: i */
    private transient Integer f71489i;

    /* renamed from: j */
    private final boolean f71490j;

    /* renamed from: k */
    private final boolean f71491k;

    /* renamed from: l */
    private final boolean f71492l;

    /* renamed from: m */
    private final boolean f71493m;

    /* renamed from: n */
    private final boolean f71494n;

    /* renamed from: o */
    private final boolean f71495o;

    /* renamed from: p */
    private final long f71496p;

    /* loaded from: classes7.dex */
    public enum Opcode {
        QUERY,
        INVERSE_QUERY,
        STATUS,
        UNASSIGNED3,
        NOTIFY,
        UPDATE;
        
        private static final Opcode[] INVERSE_LUT = new Opcode[values().length];
        private final byte value = (byte) ordinal();

        static {
            Opcode[] values;
            for (Opcode opcode : values()) {
                Opcode[] opcodeArr = INVERSE_LUT;
                if (opcodeArr[opcode.getValue()] == null) {
                    opcodeArr[opcode.getValue()] = opcode;
                } else {
                    throw new IllegalStateException();
                }
            }
        }

        Opcode() {
        }

        @Nullable
        public static Opcode getOpcode(int i) throws IllegalArgumentException {
            if (i >= 0 && i <= 15) {
                Opcode[] opcodeArr = INVERSE_LUT;
                if (i >= opcodeArr.length) {
                    return null;
                }
                return opcodeArr[i];
            }
            throw new IllegalArgumentException();
        }

        public byte getValue() {
            return this.value;
        }
    }

    /* loaded from: classes7.dex */
    public enum ResponseCode {
        NO_ERROR(0),
        FORMAT_ERR(1),
        SERVER_FAIL(2),
        NX_DOMAIN(3),
        NO_IMP(4),
        REFUSED(5),
        YXDOMAIN(6),
        YXRRSET(7),
        NXRRSET(8),
        NOT_AUTH(9),
        NOT_ZONE(10),
        BADVERS_BADSIG(16),
        BADKEY(17),
        BADTIME(18),
        BADMODE(19),
        BADNAME(20),
        BADALG(21),
        BADTRUNC(22),
        BADCOOKIE(23);
        
        @SuppressLint({"UseSparseArrays"})
        private static final Map<Integer, ResponseCode> INVERSE_LUT = new HashMap(values().length);
        private final byte value;

        static {
            ResponseCode[] values;
            for (ResponseCode responseCode : values()) {
                INVERSE_LUT.put(Integer.valueOf(responseCode.value), responseCode);
            }
        }

        ResponseCode(int i) {
            this.value = (byte) i;
        }

        @NonNull
        public static ResponseCode getResponseCode(int i) throws IllegalArgumentException {
            if (i >= 0 && i <= 65535) {
                ResponseCode responseCode = INVERSE_LUT.get(Integer.valueOf(i));
                if (responseCode != null) {
                    return responseCode;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException();
        }

        public byte getValue() {
            return this.value;
        }
    }

    @NonNull
    /* renamed from: k */
    private Builder m39619k() {
        return new Builder();
    }

    @NonNull
    /* renamed from: m */
    public static Builder m39617m() {
        return new Builder();
    }

    /* renamed from: n */
    private int m39616n() {
        int i;
        if (this.f71490j) {
            i = 32768;
        } else {
            i = 0;
        }
        Opcode opcode = this.f71484d;
        if (opcode != null) {
            i += opcode.getValue() << 11;
        }
        if (this.f71491k) {
            i += 1024;
        }
        if (this.f71483c) {
            i += 512;
        }
        if (this.f71492l) {
            i += 256;
        }
        if (this.f71493m) {
            i += 128;
        }
        if (this.f71494n) {
            i += 32;
        }
        if (this.f71495o) {
            i += 16;
        }
        return i + this.f71482b.getValue();
    }

    @NonNull
    /* renamed from: p */
    private byte[] m39614p() {
        byte[] bArr = this.f71487g;
        if (bArr != null) {
            return bArr;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        int m39616n = m39616n();
        try {
            dataOutputStream.writeShort((short) this.f71481a);
            dataOutputStream.writeShort((short) m39616n);
            List<C27094j> list = this.f71485e;
            if (list == null) {
                dataOutputStream.writeShort(0);
            } else {
                dataOutputStream.writeShort((short) list.size());
            }
            List<Record<? extends Data>> list2 = this.f71486f;
            if (list2 == null) {
                dataOutputStream.writeShort(0);
            } else {
                dataOutputStream.writeShort((short) list2.size());
            }
            dataOutputStream.writeShort(0);
            dataOutputStream.writeShort(0);
            List<C27094j> list3 = this.f71485e;
            if (list3 != null) {
                for (C27094j c27094j : list3) {
                    dataOutputStream.write(c27094j.m39598a());
                }
            }
            List<Record<? extends Data>> list4 = this.f71486f;
            if (list4 != null) {
                for (Record<? extends Data> record : list4) {
                    dataOutputStream.write(record.toByteArray());
                }
            }
            dataOutputStream.flush();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            this.f71487g = byteArray;
            return byteArray;
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DnsMessage)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        return Arrays.equals(m39614p(), ((DnsMessage) obj).m39614p());
    }

    public int hashCode() {
        if (this.f71489i == null) {
            this.f71489i = Integer.valueOf(Arrays.hashCode(m39614p()));
        }
        return this.f71489i.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    /* renamed from: l */
    public DatagramPacket m39618l(@NonNull InetAddress inetAddress, int i) {
        byte[] m39614p = m39614p();
        return new DatagramPacket(m39614p, m39614p.length, inetAddress, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    /* renamed from: o */
    public <D extends Data> Set<D> m39615o(@NonNull C27094j c27094j) {
        if (this.f71482b == ResponseCode.NO_ERROR && this.f71486f != null) {
            HashSet hashSet = new HashSet(this.f71486f.size());
            for (Record<? extends Data> record : this.f71486f) {
                if (record.isAnswer(c27094j)) {
                    hashSet.add(record.getPayload());
                }
            }
            return hashSet;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m39613q(@NonNull OutputStream outputStream) throws IOException {
        byte[] m39614p = m39614p();
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeShort(m39614p.length);
        dataOutputStream.write(m39614p);
    }

    @NonNull
    public String toString() {
        String str = this.f71488h;
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder("DnsMessage");
        m39619k().writeToStringBuilder(sb2);
        String sb3 = sb2.toString();
        this.f71488h = sb3;
        return sb3;
    }

    /* loaded from: classes7.dex */
    public static final class Builder {
        @Nullable
        private List<Record<? extends Data>> answerSection;
        private boolean authenticData;
        private boolean authoritativeAnswer;
        private boolean checkingDisabled;

        /* renamed from: id */
        private int f71497id;
        @Nullable
        private Opcode opcode;
        private boolean query;
        private long receiveTimestamp;
        private boolean recursionAvailable;
        private boolean recursionDesired;
        @Nullable
        private List<C27094j> requests;
        @NonNull
        private ResponseCode responseCode;
        private boolean truncated;

        /* JADX INFO: Access modifiers changed from: private */
        public void writeToStringBuilder(StringBuilder sb2) {
            sb2.append('(');
            sb2.append(this.f71497id);
            sb2.append(' ');
            sb2.append(this.opcode);
            sb2.append(' ');
            sb2.append(this.responseCode);
            sb2.append(' ');
            if (this.query) {
                sb2.append("resp[qr=1]");
            } else {
                sb2.append("query[qr=0]");
            }
            if (this.authoritativeAnswer) {
                sb2.append(" aa");
            }
            if (this.truncated) {
                sb2.append(" tr");
            }
            if (this.recursionDesired) {
                sb2.append(" rd");
            }
            if (this.recursionAvailable) {
                sb2.append(" ra");
            }
            if (this.authenticData) {
                sb2.append(" ad");
            }
            if (this.checkingDisabled) {
                sb2.append(" cd");
            }
            sb2.append(")\n");
            List<C27094j> list = this.requests;
            if (list != null) {
                for (C27094j c27094j : list) {
                    sb2.append("[Q: ");
                    sb2.append(c27094j);
                    sb2.append("]\n");
                }
            }
            List<Record<? extends Data>> list2 = this.answerSection;
            if (list2 != null) {
                for (Record<? extends Data> record : list2) {
                    sb2.append("[A: ");
                    sb2.append(record);
                    sb2.append("]\n");
                }
            }
            if (sb2.charAt(sb2.length() - 1) == '\n') {
                sb2.setLength(sb2.length() - 1);
            }
        }

        @NonNull
        public DnsMessage build() {
            return new DnsMessage(this);
        }

        @NonNull
        public Builder setId(int i) {
            this.f71497id = i & 65535;
            return this;
        }

        @NonNull
        public Builder setQuestion(C27094j c27094j) {
            ArrayList arrayList = new ArrayList(1);
            this.requests = arrayList;
            arrayList.add(c27094j);
            return this;
        }

        @NonNull
        public Builder setRecursionDesired(boolean z) {
            this.recursionDesired = z;
            return this;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Builder of DnsMessage");
            writeToStringBuilder(sb2);
            return sb2.toString();
        }

        private Builder() {
            this.opcode = Opcode.QUERY;
            this.responseCode = ResponseCode.NO_ERROR;
            this.receiveTimestamp = -1L;
        }

        private Builder(@NonNull DnsMessage dnsMessage) {
            this.opcode = Opcode.QUERY;
            this.responseCode = ResponseCode.NO_ERROR;
            this.receiveTimestamp = -1L;
            this.f71497id = dnsMessage.f71481a;
            this.opcode = dnsMessage.f71484d;
            this.responseCode = dnsMessage.f71482b;
            this.query = dnsMessage.f71490j;
            this.authoritativeAnswer = dnsMessage.f71491k;
            this.truncated = dnsMessage.f71483c;
            this.recursionDesired = dnsMessage.f71492l;
            this.recursionAvailable = dnsMessage.f71493m;
            this.authenticData = dnsMessage.f71494n;
            this.checkingDisabled = dnsMessage.f71495o;
            this.receiveTimestamp = dnsMessage.f71496p;
            List list = dnsMessage.f71485e;
            ArrayList arrayList = new ArrayList();
            this.requests = arrayList;
            if (list != null) {
                arrayList.addAll(list);
            }
            List list2 = dnsMessage.f71486f;
            ArrayList arrayList2 = new ArrayList();
            this.answerSection = arrayList2;
            if (list2 != null) {
                arrayList2.addAll(list2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DnsMessage(@NonNull byte[] bArr) throws IOException, IllegalArgumentException {
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        this.f71481a = dataInputStream.readUnsignedShort();
        int readUnsignedShort = dataInputStream.readUnsignedShort();
        this.f71490j = ((readUnsignedShort >> 15) & 1) == 1;
        this.f71484d = Opcode.getOpcode((readUnsignedShort >> 11) & 15);
        this.f71491k = ((readUnsignedShort >> 10) & 1) == 1;
        this.f71483c = ((readUnsignedShort >> 9) & 1) == 1;
        this.f71492l = ((readUnsignedShort >> 8) & 1) == 1;
        this.f71493m = ((readUnsignedShort >> 7) & 1) == 1;
        this.f71494n = ((readUnsignedShort >> 5) & 1) == 1;
        this.f71495o = ((readUnsignedShort >> 4) & 1) == 1;
        this.f71482b = ResponseCode.getResponseCode(readUnsignedShort & 15);
        this.f71496p = System.currentTimeMillis();
        int readUnsignedShort2 = dataInputStream.readUnsignedShort();
        int readUnsignedShort3 = dataInputStream.readUnsignedShort();
        dataInputStream.readUnsignedShort();
        dataInputStream.readUnsignedShort();
        this.f71485e = new ArrayList(readUnsignedShort2);
        for (int i = 0; i < readUnsignedShort2; i++) {
            this.f71485e.add(new C27094j(dataInputStream, bArr));
        }
        this.f71486f = new ArrayList(readUnsignedShort3);
        for (int i2 = 0; i2 < readUnsignedShort3; i2++) {
            this.f71486f.add(Record.parse(dataInputStream, bArr));
        }
    }

    private DnsMessage(@NonNull Builder builder) {
        this.f71481a = builder.f71497id;
        this.f71484d = builder.opcode;
        this.f71482b = builder.responseCode;
        this.f71496p = builder.receiveTimestamp;
        this.f71490j = builder.query;
        this.f71491k = builder.authoritativeAnswer;
        this.f71483c = builder.truncated;
        this.f71492l = builder.recursionDesired;
        this.f71493m = builder.recursionAvailable;
        this.f71494n = builder.authenticData;
        this.f71495o = builder.checkingDisabled;
        this.f71485e = Lists.toImmutableList((Collection) builder.requests);
        this.f71486f = Lists.toImmutableList((Collection) builder.answerSection);
    }
}
