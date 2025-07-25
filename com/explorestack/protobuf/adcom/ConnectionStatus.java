package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Internal;
import com.explorestack.protobuf.ProtocolMessageEnum;

/* loaded from: classes3.dex */
public enum ConnectionStatus implements ProtocolMessageEnum {
    CONNECTION_STATUS_UNDEFINED(0),
    CONNECTION_STATUS_ENABLED(1),
    CONNECTION_STATUS_DISABLED(2),
    UNRECOGNIZED(-1);
    
    public static final int CONNECTION_STATUS_DISABLED_VALUE = 2;
    public static final int CONNECTION_STATUS_ENABLED_VALUE = 1;
    public static final int CONNECTION_STATUS_UNDEFINED_VALUE = 0;
    private final int value;
    private static final Internal.EnumLiteMap<ConnectionStatus> internalValueMap = new Internal.EnumLiteMap<ConnectionStatus>() { // from class: com.explorestack.protobuf.adcom.ConnectionStatus.1
        @Override // com.explorestack.protobuf.Internal.EnumLiteMap
        public ConnectionStatus findValueByNumber(int i) {
            return ConnectionStatus.forNumber(i);
        }
    };
    private static final ConnectionStatus[] VALUES = values();

    ConnectionStatus(int i) {
        this.value = i;
    }

    public static ConnectionStatus forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return CONNECTION_STATUS_DISABLED;
            }
            return CONNECTION_STATUS_ENABLED;
        }
        return CONNECTION_STATUS_UNDEFINED;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return AdcomProto.getDescriptor().getEnumTypes().get(30);
    }

    public static Internal.EnumLiteMap<ConnectionStatus> internalGetValueMap() {
        return internalValueMap;
    }

    @Override // com.explorestack.protobuf.ProtocolMessageEnum
    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return getDescriptor();
    }

    @Override // com.explorestack.protobuf.ProtocolMessageEnum, com.explorestack.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // com.explorestack.protobuf.ProtocolMessageEnum
    public final Descriptors.EnumValueDescriptor getValueDescriptor() {
        if (this != UNRECOGNIZED) {
            return getDescriptor().getValues().get(ordinal());
        }
        throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
    }

    @Deprecated
    public static ConnectionStatus valueOf(int i) {
        return forNumber(i);
    }

    public static ConnectionStatus valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}
