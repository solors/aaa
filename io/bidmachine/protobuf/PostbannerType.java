package io.bidmachine.protobuf;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Internal;
import com.explorestack.protobuf.ProtocolMessageEnum;

/* loaded from: classes9.dex */
public enum PostbannerType implements ProtocolMessageEnum {
    DISABLED(0),
    MAIN(1),
    STORE(2),
    MIXED(3),
    UNRECOGNIZED(-1);
    
    public static final int DISABLED_VALUE = 0;
    public static final int MAIN_VALUE = 1;
    public static final int MIXED_VALUE = 3;
    public static final int STORE_VALUE = 2;
    private final int value;
    private static final Internal.EnumLiteMap<PostbannerType> internalValueMap = new Internal.EnumLiteMap<PostbannerType>() { // from class: io.bidmachine.protobuf.PostbannerType.1
        @Override // com.explorestack.protobuf.Internal.EnumLiteMap
        public PostbannerType findValueByNumber(int i) {
            return PostbannerType.forNumber(i);
        }
    };
    private static final PostbannerType[] VALUES = values();

    PostbannerType(int i) {
        this.value = i;
    }

    public static PostbannerType forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return MIXED;
                }
                return STORE;
            }
            return MAIN;
        }
        return DISABLED;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return ExtensionsProto.getDescriptor().getEnumTypes().get(0);
    }

    public static Internal.EnumLiteMap<PostbannerType> internalGetValueMap() {
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
    public static PostbannerType valueOf(int i) {
        return forNumber(i);
    }

    public static PostbannerType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}
