package io.bidmachine.protobuf;

import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.MessageOrBuilder;

@Deprecated
/* loaded from: classes9.dex */
public interface SessionOrBuilder extends MessageOrBuilder {
    String getId();

    ByteString getIdBytes();

    long getUptime();
}
