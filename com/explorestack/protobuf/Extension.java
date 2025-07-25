package com.explorestack.protobuf;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.MessageLite;

/* loaded from: classes3.dex */
public abstract class Extension<ContainingType extends MessageLite, Type> extends ExtensionLite<ContainingType, Type> {

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes3.dex */
    public enum ExtensionType {
        IMMUTABLE,
        MUTABLE,
        PROTO1
    }

    /* loaded from: classes3.dex */
    public enum MessageType {
        PROTO1,
        PROTO2
    }

    public abstract Object fromReflectionType(Object obj);

    public abstract Descriptors.FieldDescriptor getDescriptor();

    public abstract ExtensionType getExtensionType();

    @Override // com.explorestack.protobuf.ExtensionLite
    public abstract Message getMessageDefaultInstance();

    public MessageType getMessageType() {
        return MessageType.PROTO2;
    }

    @Override // com.explorestack.protobuf.ExtensionLite
    public final boolean isLite() {
        return false;
    }

    public abstract Object singularFromReflectionType(Object obj);

    public abstract Object singularToReflectionType(Object obj);

    public abstract Object toReflectionType(Object obj);
}
