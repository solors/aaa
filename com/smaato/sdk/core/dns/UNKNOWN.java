package com.smaato.sdk.core.dns;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.dns.Record;
import com.smaato.sdk.core.util.Objects;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* loaded from: classes7.dex */
public final class UNKNOWN extends Data {
    private final byte[] data;
    @NonNull
    private final Record.Type type;

    private UNKNOWN(@NonNull DataInputStream dataInputStream, int i, @NonNull Record.Type type) throws IOException {
        Objects.requireNonNull(type);
        this.type = (Record.Type) Objects.requireNonNull(type);
        byte[] bArr = new byte[i];
        this.data = bArr;
        dataInputStream.readFully(bArr);
    }

    @NonNull
    public static UNKNOWN parse(@NonNull DataInputStream dataInputStream, int i, @NonNull Record.Type type) throws IOException {
        return new UNKNOWN(dataInputStream, i, type);
    }

    @Override // com.smaato.sdk.core.dns.Data
    @NonNull
    public Record.Type getType() {
        return this.type;
    }

    @Override // com.smaato.sdk.core.dns.Data
    public void serialize(@NonNull DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.write(this.data);
    }
}
