package com.smaato.sdk.core.dns;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.dns.DnsLabel;
import com.smaato.sdk.core.dns.InvalidDnsNameException;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.IDN;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;

/* loaded from: classes7.dex */
public final class DnsName {
    public static final String ESCAPED_DOT = "\\.";
    static final int MAX_DNSNAME_LENGTH_IN_OCTETS = 255;
    private static final DnsName ROOT = new DnsName(".");
    @NonNull
    private final String ace;
    private byte[] bytes;
    private int hashCode;
    @Nullable
    private DnsLabel[] labels;
    @NonNull
    private final String rawAce;
    @Nullable
    private DnsLabel[] rawLabels;
    private int size;

    private DnsName(@NonNull String str) {
        this(str, true);
    }

    @NonNull
    public static DnsName from(@NonNull String str) {
        return new DnsName(str, false);
    }

    private byte[] getBytesForEscapedName() {
        DnsName dnsName = new DnsName(this.ace.replace("\\.", "."));
        dnsName.setBytesIfRequired();
        return dnsName.bytes;
    }

    @NonNull
    private static DnsLabel[] getLabels(@NonNull String str) {
        String[] split = str.replace("\\.", "ä").split("[.。．｡]", 128);
        for (int i = 0; i < split.length; i++) {
            split[i] = split[i].replace("ä", ".");
        }
        for (int i2 = 0; i2 < split.length / 2; i2++) {
            String str2 = split[i2];
            int length = (split.length - i2) - 1;
            split[i2] = split[length];
            split[length] = str2;
        }
        try {
            return DnsLabel.m39603c(split);
        } catch (DnsLabel.C27093a e) {
            throw new InvalidDnsNameException.LabelTooLongException(str, e.f71513b);
        }
    }

    private boolean isRootLabel() {
        if (!this.ace.isEmpty() && !this.ace.equals(".")) {
            return false;
        }
        return true;
    }

    private static String labelsToString(@NonNull DnsLabel[] dnsLabelArr, int i) {
        StringBuilder sb2 = new StringBuilder(i);
        for (int length = dnsLabelArr.length - 1; length >= 0; length--) {
            sb2.append((CharSequence) dnsLabelArr[length]);
            sb2.append('.');
        }
        sb2.setLength(sb2.length() - 1);
        return sb2.toString();
    }

    @NonNull
    public static DnsName parse(@NonNull DataInputStream dataInputStream, byte[] bArr) throws IOException {
        int readUnsignedByte = dataInputStream.readUnsignedByte();
        if ((readUnsignedByte & 192) == 192) {
            int readUnsignedByte2 = ((readUnsignedByte & 63) << 8) + dataInputStream.readUnsignedByte();
            HashSet hashSet = new HashSet();
            hashSet.add(Integer.valueOf(readUnsignedByte2));
            return parse(bArr, readUnsignedByte2, hashSet);
        } else if (readUnsignedByte == 0) {
            return ROOT;
        } else {
            byte[] bArr2 = new byte[readUnsignedByte];
            dataInputStream.readFully(bArr2);
            return from(new DnsName(new String(bArr2, Charset.forName("US-ASCII"))), parse(dataInputStream, bArr));
        }
    }

    private void setBytesIfRequired() {
        if (this.bytes != null) {
            return;
        }
        setLabelsIfRequired();
        DnsLabel[] dnsLabelArr = this.labels;
        if (dnsLabelArr == null) {
            return;
        }
        this.bytes = toBytes(dnsLabelArr);
    }

    private void setLabelsIfRequired() {
        if (this.labels != null && this.rawLabels != null) {
            return;
        }
        if (isRootLabel()) {
            this.rawLabels = new DnsLabel[0];
            this.labels = new DnsLabel[0];
            return;
        }
        this.labels = getLabels(this.ace);
        this.rawLabels = getLabels(this.rawAce);
    }

    private String stripTrailingDot(@NonNull String str) {
        int length = str.length();
        int i = length - 1;
        if (length >= 2 && str.charAt(i) == '.') {
            return str.subSequence(0, i).toString();
        }
        return str;
    }

    @NonNull
    private String toASCII(@NonNull String str) {
        DnsName dnsName = ROOT;
        if (dnsName.ace.equals(str)) {
            return dnsName.ace;
        }
        return IDN.toASCII(str);
    }

    private static byte[] toBytes(@NonNull DnsLabel[] dnsLabelArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(64);
        for (int length = dnsLabelArr.length - 1; length >= 0; length--) {
            dnsLabelArr[length].m39601e(byteArrayOutputStream);
        }
        byteArrayOutputStream.write(0);
        return byteArrayOutputStream.toByteArray();
    }

    private void validateMaxDnsnameLengthInOctets() {
        setBytesIfRequired();
        if (this.bytes.length <= 255) {
            return;
        }
        throw new InvalidDnsNameException.DNSNameTooLongException(this.ace, this.bytes);
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof DnsName)) {
            return false;
        }
        return Arrays.equals(getBytesForEscapedName(), ((DnsName) obj).getBytesForEscapedName());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public String getRawAce() {
        return this.rawAce;
    }

    public int hashCode() {
        if (this.hashCode == 0 && !isRootLabel()) {
            this.hashCode = Arrays.hashCode(getBytesForEscapedName());
        }
        return this.hashCode;
    }

    public int size() {
        if (this.size < 0) {
            if (isRootLabel()) {
                this.size = 1;
            } else {
                this.size = this.ace.length() + 2;
            }
        }
        return this.size;
    }

    @NonNull
    public String toString() {
        return this.ace;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void writeToStream(@NonNull OutputStream outputStream) throws IOException {
        setBytesIfRequired();
        outputStream.write(this.bytes);
    }

    private DnsName(@NonNull String str, boolean z) {
        this.size = -1;
        if (str.isEmpty()) {
            this.rawAce = ROOT.rawAce;
        } else {
            this.rawAce = z ? stripTrailingDot(str) : toASCII(str);
        }
        this.ace = this.rawAce.toLowerCase(Locale.US);
        validateMaxDnsnameLengthInOctets();
    }

    @NonNull
    public static DnsName from(@NonNull DnsName dnsName, @NonNull DnsName dnsName2) {
        DnsLabel[] dnsLabelArr;
        dnsName.setLabelsIfRequired();
        dnsName2.setLabelsIfRequired();
        DnsLabel[] dnsLabelArr2 = dnsName.rawLabels;
        if (dnsLabelArr2 != null && (dnsLabelArr = dnsName2.rawLabels) != null) {
            DnsLabel[] dnsLabelArr3 = new DnsLabel[dnsLabelArr2.length + dnsLabelArr.length];
            System.arraycopy(dnsLabelArr, 0, dnsLabelArr3, 0, dnsLabelArr.length);
            DnsLabel[] dnsLabelArr4 = dnsName.rawLabels;
            System.arraycopy(dnsLabelArr4, 0, dnsLabelArr3, dnsName2.rawLabels.length, dnsLabelArr4.length);
            return new DnsName(dnsLabelArr3, true);
        }
        throw new IllegalStateException("Child & parent rawLabels should not be null");
    }

    private DnsName(@NonNull DnsLabel[] dnsLabelArr, boolean z) {
        this.size = -1;
        this.rawLabels = dnsLabelArr;
        this.labels = new DnsLabel[dnsLabelArr.length];
        int i = 0;
        for (int i2 = 0; i2 < dnsLabelArr.length; i2++) {
            i += dnsLabelArr[i2].length() + 1;
            this.labels[i2] = dnsLabelArr[i2].m39605a();
        }
        this.rawAce = labelsToString(dnsLabelArr, i);
        this.ace = labelsToString(this.labels, i);
        if (z) {
            validateMaxDnsnameLengthInOctets();
        }
    }

    @NonNull
    private static DnsName parse(byte[] bArr, int i, @NonNull HashSet<Integer> hashSet) throws IllegalStateException {
        int i2 = bArr[i] & 255;
        if ((i2 & 192) != 192) {
            if (i2 == 0) {
                return ROOT;
            }
            int i3 = i + 1;
            return from(new DnsName(new String(bArr, i3, i2, Charset.forName("US-ASCII"))), parse(bArr, i3 + i2, hashSet));
        }
        int i4 = ((i2 & 63) << 8) + (bArr[i + 1] & 255);
        if (!hashSet.contains(Integer.valueOf(i4))) {
            hashSet.add(Integer.valueOf(i4));
            return parse(bArr, i4, hashSet);
        }
        throw new IllegalStateException("Cyclic offsets detected.");
    }
}
