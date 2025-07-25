package com.google.android.exoplayer2.extractor.mp4;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.nio.ByteBuffer;
import java.util.UUID;

/* loaded from: classes4.dex */
public final class PsshAtomUtil {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class PsshAtom {

        /* renamed from: a */
        private final UUID f33254a;

        /* renamed from: b */
        private final int f33255b;

        /* renamed from: c */
        private final byte[] f33256c;

        public PsshAtom(UUID uuid, int i, byte[] bArr) {
            this.f33254a = uuid;
            this.f33255b = i;
            this.f33256c = bArr;
        }
    }

    private PsshAtomUtil() {
    }

    @Nullable
    /* renamed from: a */
    private static PsshAtom m74443a(byte[] bArr) {
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr);
        if (parsableByteArray.limit() < 32) {
            return null;
        }
        parsableByteArray.setPosition(0);
        if (parsableByteArray.readInt() != parsableByteArray.bytesLeft() + 4 || parsableByteArray.readInt() != 1886614376) {
            return null;
        }
        int parseFullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
        if (parseFullAtomVersion > 1) {
            Log.m72602w("PsshAtomUtil", "Unsupported pssh version: " + parseFullAtomVersion);
            return null;
        }
        UUID uuid = new UUID(parsableByteArray.readLong(), parsableByteArray.readLong());
        if (parseFullAtomVersion == 1) {
            parsableByteArray.skipBytes(parsableByteArray.readUnsignedIntToInt() * 16);
        }
        int readUnsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        if (readUnsignedIntToInt != parsableByteArray.bytesLeft()) {
            return null;
        }
        byte[] bArr2 = new byte[readUnsignedIntToInt];
        parsableByteArray.readBytes(bArr2, 0, readUnsignedIntToInt);
        return new PsshAtom(uuid, parseFullAtomVersion, bArr2);
    }

    public static byte[] buildPsshAtom(UUID uuid, @Nullable byte[] bArr) {
        return buildPsshAtom(uuid, null, bArr);
    }

    public static boolean isPsshAtom(byte[] bArr) {
        if (m74443a(bArr) != null) {
            return true;
        }
        return false;
    }

    @Nullable
    public static byte[] parseSchemeSpecificData(byte[] bArr, UUID uuid) {
        PsshAtom m74443a = m74443a(bArr);
        if (m74443a == null) {
            return null;
        }
        if (uuid.equals(m74443a.f33254a)) {
            return m74443a.f33256c;
        }
        Log.m72602w("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + m74443a.f33254a + ".");
        return null;
    }

    @Nullable
    public static UUID parseUuid(byte[] bArr) {
        PsshAtom m74443a = m74443a(bArr);
        if (m74443a != null) {
            return m74443a.f33254a;
        }
        return null;
    }

    public static int parseVersion(byte[] bArr) {
        PsshAtom m74443a = m74443a(bArr);
        if (m74443a != null) {
            return m74443a.f33255b;
        }
        return -1;
    }

    public static byte[] buildPsshAtom(UUID uuid, @Nullable UUID[] uuidArr, @Nullable byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(length);
        allocate.putInt(length);
        allocate.putInt(1886614376);
        allocate.putInt(uuidArr != null ? 16777216 : 0);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr != null && bArr.length != 0) {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }
}
