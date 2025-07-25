package com.smaato.sdk.core.dns;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.dns.Record;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class TXT extends Data {
    private final byte[] blob;
    @Nullable
    private List<String> characterStringsCache;
    @Nullable
    private String textCache;

    private TXT(byte[] bArr) {
        this.blob = bArr;
    }

    @NonNull
    private List<String> getCharacterStrings() {
        if (this.characterStringsCache == null) {
            List<byte[]> extents = getExtents();
            ArrayList arrayList = new ArrayList(extents.size());
            for (byte[] bArr : extents) {
                try {
                    arrayList.add(new String(bArr, "UTF-8"));
                } catch (UnsupportedEncodingException e) {
                    throw new AssertionError(e);
                }
            }
            this.characterStringsCache = Collections.unmodifiableList(arrayList);
        }
        return this.characterStringsCache;
    }

    @NonNull
    private List<byte[]> getExtents() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            byte[] bArr = this.blob;
            if (i < bArr.length) {
                int i2 = i + 1;
                int i3 = (bArr[i] & 255) + i2;
                arrayList.add(Arrays.copyOfRange(bArr, i2, i3));
                i = i3;
            } else {
                return arrayList;
            }
        }
    }

    @NonNull
    public static TXT parse(@NonNull DataInputStream dataInputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        dataInputStream.readFully(bArr);
        return new TXT(bArr);
    }

    @NonNull
    public String getText() {
        if (this.textCache == null) {
            StringBuilder sb2 = new StringBuilder();
            Iterator<String> it = getCharacterStrings().iterator();
            while (it.hasNext()) {
                sb2.append(it.next());
                if (it.hasNext()) {
                    sb2.append(" / ");
                }
            }
            this.textCache = sb2.toString();
        }
        return this.textCache;
    }

    @Override // com.smaato.sdk.core.dns.Data
    @NonNull
    public Record.Type getType() {
        return Record.Type.TXT;
    }

    @Override // com.smaato.sdk.core.dns.Data
    public void serialize(@NonNull DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.write(this.blob);
    }

    @NonNull
    public String toString() {
        return "\"" + getText() + "\"";
    }
}
