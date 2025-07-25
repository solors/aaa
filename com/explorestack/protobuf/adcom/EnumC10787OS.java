package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Internal;
import com.explorestack.protobuf.ProtocolMessageEnum;

/* renamed from: com.explorestack.protobuf.adcom.OS */
/* loaded from: classes3.dex */
public enum EnumC10787OS implements ProtocolMessageEnum {
    OS_INVALID(0),
    OS_ANDROID(2),
    OS_IOS(13),
    UNRECOGNIZED(-1);
    
    public static final int OS_ANDROID_VALUE = 2;
    public static final int OS_INVALID_VALUE = 0;
    public static final int OS_IOS_VALUE = 13;
    private final int value;
    private static final Internal.EnumLiteMap<EnumC10787OS> internalValueMap = new Internal.EnumLiteMap<EnumC10787OS>() { // from class: com.explorestack.protobuf.adcom.OS.1
        @Override // com.explorestack.protobuf.Internal.EnumLiteMap
        public EnumC10787OS findValueByNumber(int i) {
            return EnumC10787OS.forNumber(i);
        }
    };
    private static final EnumC10787OS[] VALUES = values();

    EnumC10787OS(int i) {
        this.value = i;
    }

    public static EnumC10787OS forNumber(int i) {
        if (i != 0) {
            if (i != 2) {
                if (i != 13) {
                    return null;
                }
                return OS_IOS;
            }
            return OS_ANDROID;
        }
        return OS_INVALID;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return AdcomProto.getDescriptor().getEnumTypes().get(22);
    }

    public static Internal.EnumLiteMap<EnumC10787OS> internalGetValueMap() {
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
    public static EnumC10787OS valueOf(int i) {
        return forNumber(i);
    }

    public static EnumC10787OS valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}
