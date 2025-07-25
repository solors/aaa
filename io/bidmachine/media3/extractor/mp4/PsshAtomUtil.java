package io.bidmachine.media3.extractor.mp4;

import androidx.annotation.Nullable;
import io.bidmachine.media3.common.util.Log;
import io.bidmachine.media3.common.util.ParsableByteArray;
import io.bidmachine.media3.common.util.UnstableApi;
import java.nio.ByteBuffer;
import java.util.UUID;

@UnstableApi
/* loaded from: classes9.dex */
public final class PsshAtomUtil {
    private static final String TAG = "PsshAtomUtil";

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.bidmachine.media3.extractor.mp4.PsshAtomUtil$a */
    /* loaded from: classes9.dex */
    public static class C36591a {
        private final byte[] schemeData;
        private final UUID uuid;
        private final int version;

        public C36591a(UUID uuid, int i, byte[] bArr) {
            this.uuid = uuid;
            this.version = i;
            this.schemeData = bArr;
        }
    }

    private PsshAtomUtil() {
    }

    public static byte[] buildPsshAtom(UUID uuid, @Nullable byte[] bArr) {
        return buildPsshAtom(uuid, null, bArr);
    }

    public static boolean isPsshAtom(byte[] bArr) {
        if (parsePsshAtom(bArr) != null) {
            return true;
        }
        return false;
    }

    @Nullable
    private static C36591a parsePsshAtom(byte[] bArr) {
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
            Log.m19945w(TAG, "Unsupported pssh version: " + parseFullAtomVersion);
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
        return new C36591a(uuid, parseFullAtomVersion, bArr2);
    }

    @Nullable
    public static byte[] parseSchemeSpecificData(byte[] bArr, UUID uuid) {
        C36591a parsePsshAtom = parsePsshAtom(bArr);
        if (parsePsshAtom == null) {
            return null;
        }
        if (uuid.equals(parsePsshAtom.uuid)) {
            return parsePsshAtom.schemeData;
        }
        Log.m19945w(TAG, "UUID mismatch. Expected: " + uuid + ", got: " + parsePsshAtom.uuid + ".");
        return null;
    }

    @Nullable
    public static UUID parseUuid(byte[] bArr) {
        C36591a parsePsshAtom = parsePsshAtom(bArr);
        if (parsePsshAtom != null) {
            return parsePsshAtom.uuid;
        }
        return null;
    }

    public static int parseVersion(byte[] bArr) {
        C36591a parsePsshAtom = parsePsshAtom(bArr);
        if (parsePsshAtom != null) {
            return parsePsshAtom.version;
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
