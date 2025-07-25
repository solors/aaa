package io.bidmachine.protobuf;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Internal;
import com.explorestack.protobuf.ProtocolMessageEnum;

/* loaded from: classes9.dex */
public enum HeaderBiddingType implements ProtocolMessageEnum {
    HEADER_BIDDING_TYPE_INVALID(0),
    HEADER_BIDDING_TYPE_DISABLED(-1),
    HEADER_BIDDING_TYPE_ENABLED(1),
    UNRECOGNIZED(-1);
    
    public static final int HEADER_BIDDING_TYPE_DISABLED_VALUE = -1;
    public static final int HEADER_BIDDING_TYPE_ENABLED_VALUE = 1;
    public static final int HEADER_BIDDING_TYPE_INVALID_VALUE = 0;
    private final int value;
    private static final Internal.EnumLiteMap<HeaderBiddingType> internalValueMap = new Internal.EnumLiteMap<HeaderBiddingType>() { // from class: io.bidmachine.protobuf.HeaderBiddingType.1
        @Override // com.explorestack.protobuf.Internal.EnumLiteMap
        public HeaderBiddingType findValueByNumber(int i) {
            return HeaderBiddingType.forNumber(i);
        }
    };
    private static final HeaderBiddingType[] VALUES = values();

    HeaderBiddingType(int i) {
        this.value = i;
    }

    public static HeaderBiddingType forNumber(int i) {
        if (i != -1) {
            if (i != 0) {
                if (i != 1) {
                    return null;
                }
                return HEADER_BIDDING_TYPE_ENABLED;
            }
            return HEADER_BIDDING_TYPE_INVALID;
        }
        return HEADER_BIDDING_TYPE_DISABLED;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return ExtensionsProto.getDescriptor().getEnumTypes().get(4);
    }

    public static Internal.EnumLiteMap<HeaderBiddingType> internalGetValueMap() {
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
    public static HeaderBiddingType valueOf(int i) {
        return forNumber(i);
    }

    public static HeaderBiddingType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}
