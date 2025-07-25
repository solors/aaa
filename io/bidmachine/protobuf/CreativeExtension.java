package io.bidmachine.protobuf;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.AbstractMessageLite;
import com.explorestack.protobuf.AbstractParser;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.CodedInputStream;
import com.explorestack.protobuf.CodedOutputStream;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.ExtensionRegistryLite;
import com.explorestack.protobuf.GeneratedMessageV3;
import com.explorestack.protobuf.Internal;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.Parser;
import com.explorestack.protobuf.RepeatedFieldBuilderV3;
import com.explorestack.protobuf.SingleFieldBuilderV3;
import com.explorestack.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes9.dex */
public final class CreativeExtension extends GeneratedMessageV3 implements CreativeExtensionOrBuilder {
    public static final int ASSET_FIELD_NUMBER = 1;
    public static final int FEATURES_FIELD_NUMBER = 2;
    public static final int POSTBANNERS_FIELD_NUMBER = 3;
    private static final long serialVersionUID = 0;
    private AssetAppearance asset_;
    private List<Feature> features_;
    private byte memoizedIsInitialized;
    private List<Postbanner> postbanners_;
    private static final CreativeExtension DEFAULT_INSTANCE = new CreativeExtension();
    private static final Parser<CreativeExtension> PARSER = new AbstractParser<CreativeExtension>() { // from class: io.bidmachine.protobuf.CreativeExtension.1
        @Override // com.explorestack.protobuf.Parser
        public CreativeExtension parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new CreativeExtension(codedInputStream, extensionRegistryLite);
        }
    };

    /* loaded from: classes9.dex */
    public static final class AssetAppearance extends GeneratedMessageV3 implements AssetAppearanceOrBuilder {
        public static final int AUTOROTATE_FIELD_NUMBER = 5;
        public static final int BACKGROUND_COLOR_FIELD_NUMBER = 12;
        public static final int CLOSABLE_VIEW_FIELD_NUMBER = 7;
        public static final int CLOSE_TIME_FIELD_NUMBER = 1;
        public static final int COUNTDOWN_FIELD_NUMBER = 6;
        public static final int CTA_FIELD_NUMBER = 9;
        public static final int DURATION_FIELD_NUMBER = 2;
        public static final int IGNORES_SAFE_AREA_LAYOUT_GUIDE_FIELD_NUMBER = 3;
        public static final int MUTE_ASSET_FIELD_NUMBER = 10;
        public static final int PROGRESS_FIELD_NUMBER = 8;
        public static final int USE_CUSTOM_CLOSE_FIELD_NUMBER = 4;
        public static final int VIDEO_ASSET_FIELD_NUMBER = 11;
        private static final long serialVersionUID = 0;
        private boolean autorotate_;
        private volatile Object backgroundColor_;
        private AssetModel closableView_;
        private float closeTime_;
        private AssetModel countdown_;
        private AssetModel cta_;
        private int duration_;
        private boolean ignoresSafeAreaLayoutGuide_;
        private byte memoizedIsInitialized;
        private AssetModel muteAsset_;
        private AssetModel progress_;
        private boolean useCustomClose_;
        private AssetModel videoAsset_;
        private static final AssetAppearance DEFAULT_INSTANCE = new AssetAppearance();
        private static final Parser<AssetAppearance> PARSER = new AbstractParser<AssetAppearance>() { // from class: io.bidmachine.protobuf.CreativeExtension.AssetAppearance.1
            @Override // com.explorestack.protobuf.Parser
            public AssetAppearance parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new AssetAppearance(codedInputStream, extensionRegistryLite);
            }
        };

        public static AssetAppearance getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ExtensionsProto.f97394xb3b68037;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AssetAppearance parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AssetAppearance) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AssetAppearance parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<AssetAppearance> parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AssetAppearance)) {
                return super.equals(obj);
            }
            AssetAppearance assetAppearance = (AssetAppearance) obj;
            if (Float.floatToIntBits(getCloseTime()) != Float.floatToIntBits(assetAppearance.getCloseTime()) || getDuration() != assetAppearance.getDuration() || getIgnoresSafeAreaLayoutGuide() != assetAppearance.getIgnoresSafeAreaLayoutGuide() || getUseCustomClose() != assetAppearance.getUseCustomClose() || getAutorotate() != assetAppearance.getAutorotate() || hasCountdown() != assetAppearance.hasCountdown()) {
                return false;
            }
            if ((hasCountdown() && !getCountdown().equals(assetAppearance.getCountdown())) || hasClosableView() != assetAppearance.hasClosableView()) {
                return false;
            }
            if ((hasClosableView() && !getClosableView().equals(assetAppearance.getClosableView())) || hasProgress() != assetAppearance.hasProgress()) {
                return false;
            }
            if ((hasProgress() && !getProgress().equals(assetAppearance.getProgress())) || hasCta() != assetAppearance.hasCta()) {
                return false;
            }
            if ((hasCta() && !getCta().equals(assetAppearance.getCta())) || hasMuteAsset() != assetAppearance.hasMuteAsset()) {
                return false;
            }
            if ((hasMuteAsset() && !getMuteAsset().equals(assetAppearance.getMuteAsset())) || hasVideoAsset() != assetAppearance.hasVideoAsset()) {
                return false;
            }
            if ((!hasVideoAsset() || getVideoAsset().equals(assetAppearance.getVideoAsset())) && getBackgroundColor().equals(assetAppearance.getBackgroundColor()) && this.unknownFields.equals(assetAppearance.unknownFields)) {
                return true;
            }
            return false;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
        public boolean getAutorotate() {
            return this.autorotate_;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
        public String getBackgroundColor() {
            Object obj = this.backgroundColor_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.backgroundColor_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
        public ByteString getBackgroundColorBytes() {
            Object obj = this.backgroundColor_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.backgroundColor_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
        public AssetModel getClosableView() {
            AssetModel assetModel = this.closableView_;
            if (assetModel == null) {
                return AssetModel.getDefaultInstance();
            }
            return assetModel;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
        public AssetModelOrBuilder getClosableViewOrBuilder() {
            return getClosableView();
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
        public float getCloseTime() {
            return this.closeTime_;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
        public AssetModel getCountdown() {
            AssetModel assetModel = this.countdown_;
            if (assetModel == null) {
                return AssetModel.getDefaultInstance();
            }
            return assetModel;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
        public AssetModelOrBuilder getCountdownOrBuilder() {
            return getCountdown();
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
        public AssetModel getCta() {
            AssetModel assetModel = this.cta_;
            if (assetModel == null) {
                return AssetModel.getDefaultInstance();
            }
            return assetModel;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
        public AssetModelOrBuilder getCtaOrBuilder() {
            return getCta();
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
        public int getDuration() {
            return this.duration_;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
        public boolean getIgnoresSafeAreaLayoutGuide() {
            return this.ignoresSafeAreaLayoutGuide_;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
        public AssetModel getMuteAsset() {
            AssetModel assetModel = this.muteAsset_;
            if (assetModel == null) {
                return AssetModel.getDefaultInstance();
            }
            return assetModel;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
        public AssetModelOrBuilder getMuteAssetOrBuilder() {
            return getMuteAsset();
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Parser<AssetAppearance> getParserForType() {
            return PARSER;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
        public AssetModel getProgress() {
            AssetModel assetModel = this.progress_;
            if (assetModel == null) {
                return AssetModel.getDefaultInstance();
            }
            return assetModel;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
        public AssetModelOrBuilder getProgressOrBuilder() {
            return getProgress();
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            float f = this.closeTime_;
            int i2 = 0;
            if (f != 0.0f) {
                i2 = 0 + CodedOutputStream.computeFloatSize(1, f);
            }
            int i3 = this.duration_;
            if (i3 != 0) {
                i2 += CodedOutputStream.computeUInt32Size(2, i3);
            }
            boolean z = this.ignoresSafeAreaLayoutGuide_;
            if (z) {
                i2 += CodedOutputStream.computeBoolSize(3, z);
            }
            boolean z2 = this.useCustomClose_;
            if (z2) {
                i2 += CodedOutputStream.computeBoolSize(4, z2);
            }
            boolean z3 = this.autorotate_;
            if (z3) {
                i2 += CodedOutputStream.computeBoolSize(5, z3);
            }
            if (this.countdown_ != null) {
                i2 += CodedOutputStream.computeMessageSize(6, getCountdown());
            }
            if (this.closableView_ != null) {
                i2 += CodedOutputStream.computeMessageSize(7, getClosableView());
            }
            if (this.progress_ != null) {
                i2 += CodedOutputStream.computeMessageSize(8, getProgress());
            }
            if (this.cta_ != null) {
                i2 += CodedOutputStream.computeMessageSize(9, getCta());
            }
            if (this.muteAsset_ != null) {
                i2 += CodedOutputStream.computeMessageSize(10, getMuteAsset());
            }
            if (this.videoAsset_ != null) {
                i2 += CodedOutputStream.computeMessageSize(11, getVideoAsset());
            }
            if (!getBackgroundColorBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(12, this.backgroundColor_);
            }
            int serializedSize = i2 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
        public boolean getUseCustomClose() {
            return this.useCustomClose_;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
        public AssetModel getVideoAsset() {
            AssetModel assetModel = this.videoAsset_;
            if (assetModel == null) {
                return AssetModel.getDefaultInstance();
            }
            return assetModel;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
        public AssetModelOrBuilder getVideoAssetOrBuilder() {
            return getVideoAsset();
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
        public boolean hasClosableView() {
            if (this.closableView_ != null) {
                return true;
            }
            return false;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
        public boolean hasCountdown() {
            if (this.countdown_ != null) {
                return true;
            }
            return false;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
        public boolean hasCta() {
            if (this.cta_ != null) {
                return true;
            }
            return false;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
        public boolean hasMuteAsset() {
            if (this.muteAsset_ != null) {
                return true;
            }
            return false;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
        public boolean hasProgress() {
            if (this.progress_ != null) {
                return true;
            }
            return false;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
        public boolean hasVideoAsset() {
            if (this.videoAsset_ != null) {
                return true;
            }
            return false;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = ((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + Float.floatToIntBits(getCloseTime())) * 37) + 2) * 53) + getDuration()) * 37) + 3) * 53) + Internal.hashBoolean(getIgnoresSafeAreaLayoutGuide())) * 37) + 4) * 53) + Internal.hashBoolean(getUseCustomClose())) * 37) + 5) * 53) + Internal.hashBoolean(getAutorotate());
            if (hasCountdown()) {
                hashCode = (((hashCode * 37) + 6) * 53) + getCountdown().hashCode();
            }
            if (hasClosableView()) {
                hashCode = (((hashCode * 37) + 7) * 53) + getClosableView().hashCode();
            }
            if (hasProgress()) {
                hashCode = (((hashCode * 37) + 8) * 53) + getProgress().hashCode();
            }
            if (hasCta()) {
                hashCode = (((hashCode * 37) + 9) * 53) + getCta().hashCode();
            }
            if (hasMuteAsset()) {
                hashCode = (((hashCode * 37) + 10) * 53) + getMuteAsset().hashCode();
            }
            if (hasVideoAsset()) {
                hashCode = (((hashCode * 37) + 11) * 53) + getVideoAsset().hashCode();
            }
            int hashCode2 = (((((hashCode * 37) + 12) * 53) + getBackgroundColor().hashCode()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExtensionsProto.f97395xd3597fb5.ensureFieldAccessorsInitialized(AssetAppearance.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new AssetAppearance();
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            float f = this.closeTime_;
            if (f != 0.0f) {
                codedOutputStream.writeFloat(1, f);
            }
            int i = this.duration_;
            if (i != 0) {
                codedOutputStream.writeUInt32(2, i);
            }
            boolean z = this.ignoresSafeAreaLayoutGuide_;
            if (z) {
                codedOutputStream.writeBool(3, z);
            }
            boolean z2 = this.useCustomClose_;
            if (z2) {
                codedOutputStream.writeBool(4, z2);
            }
            boolean z3 = this.autorotate_;
            if (z3) {
                codedOutputStream.writeBool(5, z3);
            }
            if (this.countdown_ != null) {
                codedOutputStream.writeMessage(6, getCountdown());
            }
            if (this.closableView_ != null) {
                codedOutputStream.writeMessage(7, getClosableView());
            }
            if (this.progress_ != null) {
                codedOutputStream.writeMessage(8, getProgress());
            }
            if (this.cta_ != null) {
                codedOutputStream.writeMessage(9, getCta());
            }
            if (this.muteAsset_ != null) {
                codedOutputStream.writeMessage(10, getMuteAsset());
            }
            if (this.videoAsset_ != null) {
                codedOutputStream.writeMessage(11, getVideoAsset());
            }
            if (!getBackgroundColorBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 12, this.backgroundColor_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* loaded from: classes9.dex */
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AssetAppearanceOrBuilder {
            private boolean autorotate_;
            private Object backgroundColor_;
            private SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> closableViewBuilder_;
            private AssetModel closableView_;
            private float closeTime_;
            private SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> countdownBuilder_;
            private AssetModel countdown_;
            private SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> ctaBuilder_;
            private AssetModel cta_;
            private int duration_;
            private boolean ignoresSafeAreaLayoutGuide_;
            private SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> muteAssetBuilder_;
            private AssetModel muteAsset_;
            private SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> progressBuilder_;
            private AssetModel progress_;
            private boolean useCustomClose_;
            private SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> videoAssetBuilder_;
            private AssetModel videoAsset_;

            private SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> getClosableViewFieldBuilder() {
                if (this.closableViewBuilder_ == null) {
                    this.closableViewBuilder_ = new SingleFieldBuilderV3<>(getClosableView(), getParentForChildren(), isClean());
                    this.closableView_ = null;
                }
                return this.closableViewBuilder_;
            }

            private SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> getCountdownFieldBuilder() {
                if (this.countdownBuilder_ == null) {
                    this.countdownBuilder_ = new SingleFieldBuilderV3<>(getCountdown(), getParentForChildren(), isClean());
                    this.countdown_ = null;
                }
                return this.countdownBuilder_;
            }

            private SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> getCtaFieldBuilder() {
                if (this.ctaBuilder_ == null) {
                    this.ctaBuilder_ = new SingleFieldBuilderV3<>(getCta(), getParentForChildren(), isClean());
                    this.cta_ = null;
                }
                return this.ctaBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return ExtensionsProto.f97394xb3b68037;
            }

            private SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> getMuteAssetFieldBuilder() {
                if (this.muteAssetBuilder_ == null) {
                    this.muteAssetBuilder_ = new SingleFieldBuilderV3<>(getMuteAsset(), getParentForChildren(), isClean());
                    this.muteAsset_ = null;
                }
                return this.muteAssetBuilder_;
            }

            private SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> getProgressFieldBuilder() {
                if (this.progressBuilder_ == null) {
                    this.progressBuilder_ = new SingleFieldBuilderV3<>(getProgress(), getParentForChildren(), isClean());
                    this.progress_ = null;
                }
                return this.progressBuilder_;
            }

            private SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> getVideoAssetFieldBuilder() {
                if (this.videoAssetBuilder_ == null) {
                    this.videoAssetBuilder_ = new SingleFieldBuilderV3<>(getVideoAsset(), getParentForChildren(), isClean());
                    this.videoAsset_ = null;
                }
                return this.videoAssetBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
            }

            public Builder clearAutorotate() {
                this.autorotate_ = false;
                onChanged();
                return this;
            }

            public Builder clearBackgroundColor() {
                this.backgroundColor_ = AssetAppearance.getDefaultInstance().getBackgroundColor();
                onChanged();
                return this;
            }

            public Builder clearClosableView() {
                if (this.closableViewBuilder_ == null) {
                    this.closableView_ = null;
                    onChanged();
                } else {
                    this.closableView_ = null;
                    this.closableViewBuilder_ = null;
                }
                return this;
            }

            public Builder clearCloseTime() {
                this.closeTime_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearCountdown() {
                if (this.countdownBuilder_ == null) {
                    this.countdown_ = null;
                    onChanged();
                } else {
                    this.countdown_ = null;
                    this.countdownBuilder_ = null;
                }
                return this;
            }

            public Builder clearCta() {
                if (this.ctaBuilder_ == null) {
                    this.cta_ = null;
                    onChanged();
                } else {
                    this.cta_ = null;
                    this.ctaBuilder_ = null;
                }
                return this;
            }

            public Builder clearDuration() {
                this.duration_ = 0;
                onChanged();
                return this;
            }

            public Builder clearIgnoresSafeAreaLayoutGuide() {
                this.ignoresSafeAreaLayoutGuide_ = false;
                onChanged();
                return this;
            }

            public Builder clearMuteAsset() {
                if (this.muteAssetBuilder_ == null) {
                    this.muteAsset_ = null;
                    onChanged();
                } else {
                    this.muteAsset_ = null;
                    this.muteAssetBuilder_ = null;
                }
                return this;
            }

            public Builder clearProgress() {
                if (this.progressBuilder_ == null) {
                    this.progress_ = null;
                    onChanged();
                } else {
                    this.progress_ = null;
                    this.progressBuilder_ = null;
                }
                return this;
            }

            public Builder clearUseCustomClose() {
                this.useCustomClose_ = false;
                onChanged();
                return this;
            }

            public Builder clearVideoAsset() {
                if (this.videoAssetBuilder_ == null) {
                    this.videoAsset_ = null;
                    onChanged();
                } else {
                    this.videoAsset_ = null;
                    this.videoAssetBuilder_ = null;
                }
                return this;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
            public boolean getAutorotate() {
                return this.autorotate_;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
            public String getBackgroundColor() {
                Object obj = this.backgroundColor_;
                if (!(obj instanceof String)) {
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.backgroundColor_ = stringUtf8;
                    return stringUtf8;
                }
                return (String) obj;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
            public ByteString getBackgroundColorBytes() {
                Object obj = this.backgroundColor_;
                if (obj instanceof String) {
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.backgroundColor_ = copyFromUtf8;
                    return copyFromUtf8;
                }
                return (ByteString) obj;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
            public AssetModel getClosableView() {
                SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> singleFieldBuilderV3 = this.closableViewBuilder_;
                if (singleFieldBuilderV3 == null) {
                    AssetModel assetModel = this.closableView_;
                    if (assetModel == null) {
                        return AssetModel.getDefaultInstance();
                    }
                    return assetModel;
                }
                return singleFieldBuilderV3.getMessage();
            }

            public AssetModel.Builder getClosableViewBuilder() {
                onChanged();
                return getClosableViewFieldBuilder().getBuilder();
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
            public AssetModelOrBuilder getClosableViewOrBuilder() {
                SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> singleFieldBuilderV3 = this.closableViewBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return singleFieldBuilderV3.getMessageOrBuilder();
                }
                AssetModel assetModel = this.closableView_;
                if (assetModel == null) {
                    return AssetModel.getDefaultInstance();
                }
                return assetModel;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
            public float getCloseTime() {
                return this.closeTime_;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
            public AssetModel getCountdown() {
                SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> singleFieldBuilderV3 = this.countdownBuilder_;
                if (singleFieldBuilderV3 == null) {
                    AssetModel assetModel = this.countdown_;
                    if (assetModel == null) {
                        return AssetModel.getDefaultInstance();
                    }
                    return assetModel;
                }
                return singleFieldBuilderV3.getMessage();
            }

            public AssetModel.Builder getCountdownBuilder() {
                onChanged();
                return getCountdownFieldBuilder().getBuilder();
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
            public AssetModelOrBuilder getCountdownOrBuilder() {
                SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> singleFieldBuilderV3 = this.countdownBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return singleFieldBuilderV3.getMessageOrBuilder();
                }
                AssetModel assetModel = this.countdown_;
                if (assetModel == null) {
                    return AssetModel.getDefaultInstance();
                }
                return assetModel;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
            public AssetModel getCta() {
                SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> singleFieldBuilderV3 = this.ctaBuilder_;
                if (singleFieldBuilderV3 == null) {
                    AssetModel assetModel = this.cta_;
                    if (assetModel == null) {
                        return AssetModel.getDefaultInstance();
                    }
                    return assetModel;
                }
                return singleFieldBuilderV3.getMessage();
            }

            public AssetModel.Builder getCtaBuilder() {
                onChanged();
                return getCtaFieldBuilder().getBuilder();
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
            public AssetModelOrBuilder getCtaOrBuilder() {
                SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> singleFieldBuilderV3 = this.ctaBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return singleFieldBuilderV3.getMessageOrBuilder();
                }
                AssetModel assetModel = this.cta_;
                if (assetModel == null) {
                    return AssetModel.getDefaultInstance();
                }
                return assetModel;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return ExtensionsProto.f97394xb3b68037;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
            public int getDuration() {
                return this.duration_;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
            public boolean getIgnoresSafeAreaLayoutGuide() {
                return this.ignoresSafeAreaLayoutGuide_;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
            public AssetModel getMuteAsset() {
                SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> singleFieldBuilderV3 = this.muteAssetBuilder_;
                if (singleFieldBuilderV3 == null) {
                    AssetModel assetModel = this.muteAsset_;
                    if (assetModel == null) {
                        return AssetModel.getDefaultInstance();
                    }
                    return assetModel;
                }
                return singleFieldBuilderV3.getMessage();
            }

            public AssetModel.Builder getMuteAssetBuilder() {
                onChanged();
                return getMuteAssetFieldBuilder().getBuilder();
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
            public AssetModelOrBuilder getMuteAssetOrBuilder() {
                SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> singleFieldBuilderV3 = this.muteAssetBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return singleFieldBuilderV3.getMessageOrBuilder();
                }
                AssetModel assetModel = this.muteAsset_;
                if (assetModel == null) {
                    return AssetModel.getDefaultInstance();
                }
                return assetModel;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
            public AssetModel getProgress() {
                SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> singleFieldBuilderV3 = this.progressBuilder_;
                if (singleFieldBuilderV3 == null) {
                    AssetModel assetModel = this.progress_;
                    if (assetModel == null) {
                        return AssetModel.getDefaultInstance();
                    }
                    return assetModel;
                }
                return singleFieldBuilderV3.getMessage();
            }

            public AssetModel.Builder getProgressBuilder() {
                onChanged();
                return getProgressFieldBuilder().getBuilder();
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
            public AssetModelOrBuilder getProgressOrBuilder() {
                SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> singleFieldBuilderV3 = this.progressBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return singleFieldBuilderV3.getMessageOrBuilder();
                }
                AssetModel assetModel = this.progress_;
                if (assetModel == null) {
                    return AssetModel.getDefaultInstance();
                }
                return assetModel;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
            public boolean getUseCustomClose() {
                return this.useCustomClose_;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
            public AssetModel getVideoAsset() {
                SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> singleFieldBuilderV3 = this.videoAssetBuilder_;
                if (singleFieldBuilderV3 == null) {
                    AssetModel assetModel = this.videoAsset_;
                    if (assetModel == null) {
                        return AssetModel.getDefaultInstance();
                    }
                    return assetModel;
                }
                return singleFieldBuilderV3.getMessage();
            }

            public AssetModel.Builder getVideoAssetBuilder() {
                onChanged();
                return getVideoAssetFieldBuilder().getBuilder();
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
            public AssetModelOrBuilder getVideoAssetOrBuilder() {
                SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> singleFieldBuilderV3 = this.videoAssetBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return singleFieldBuilderV3.getMessageOrBuilder();
                }
                AssetModel assetModel = this.videoAsset_;
                if (assetModel == null) {
                    return AssetModel.getDefaultInstance();
                }
                return assetModel;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
            public boolean hasClosableView() {
                if (this.closableViewBuilder_ == null && this.closableView_ == null) {
                    return false;
                }
                return true;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
            public boolean hasCountdown() {
                if (this.countdownBuilder_ == null && this.countdown_ == null) {
                    return false;
                }
                return true;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
            public boolean hasCta() {
                if (this.ctaBuilder_ == null && this.cta_ == null) {
                    return false;
                }
                return true;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
            public boolean hasMuteAsset() {
                if (this.muteAssetBuilder_ == null && this.muteAsset_ == null) {
                    return false;
                }
                return true;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
            public boolean hasProgress() {
                if (this.progressBuilder_ == null && this.progress_ == null) {
                    return false;
                }
                return true;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
            public boolean hasVideoAsset() {
                if (this.videoAssetBuilder_ == null && this.videoAsset_ == null) {
                    return false;
                }
                return true;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
            protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return ExtensionsProto.f97395xd3597fb5.ensureFieldAccessorsInitialized(AssetAppearance.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeClosableView(AssetModel assetModel) {
                SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> singleFieldBuilderV3 = this.closableViewBuilder_;
                if (singleFieldBuilderV3 == null) {
                    AssetModel assetModel2 = this.closableView_;
                    if (assetModel2 != null) {
                        this.closableView_ = AssetModel.newBuilder(assetModel2).mergeFrom(assetModel).buildPartial();
                    } else {
                        this.closableView_ = assetModel;
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(assetModel);
                }
                return this;
            }

            public Builder mergeCountdown(AssetModel assetModel) {
                SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> singleFieldBuilderV3 = this.countdownBuilder_;
                if (singleFieldBuilderV3 == null) {
                    AssetModel assetModel2 = this.countdown_;
                    if (assetModel2 != null) {
                        this.countdown_ = AssetModel.newBuilder(assetModel2).mergeFrom(assetModel).buildPartial();
                    } else {
                        this.countdown_ = assetModel;
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(assetModel);
                }
                return this;
            }

            public Builder mergeCta(AssetModel assetModel) {
                SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> singleFieldBuilderV3 = this.ctaBuilder_;
                if (singleFieldBuilderV3 == null) {
                    AssetModel assetModel2 = this.cta_;
                    if (assetModel2 != null) {
                        this.cta_ = AssetModel.newBuilder(assetModel2).mergeFrom(assetModel).buildPartial();
                    } else {
                        this.cta_ = assetModel;
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(assetModel);
                }
                return this;
            }

            public Builder mergeMuteAsset(AssetModel assetModel) {
                SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> singleFieldBuilderV3 = this.muteAssetBuilder_;
                if (singleFieldBuilderV3 == null) {
                    AssetModel assetModel2 = this.muteAsset_;
                    if (assetModel2 != null) {
                        this.muteAsset_ = AssetModel.newBuilder(assetModel2).mergeFrom(assetModel).buildPartial();
                    } else {
                        this.muteAsset_ = assetModel;
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(assetModel);
                }
                return this;
            }

            public Builder mergeProgress(AssetModel assetModel) {
                SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> singleFieldBuilderV3 = this.progressBuilder_;
                if (singleFieldBuilderV3 == null) {
                    AssetModel assetModel2 = this.progress_;
                    if (assetModel2 != null) {
                        this.progress_ = AssetModel.newBuilder(assetModel2).mergeFrom(assetModel).buildPartial();
                    } else {
                        this.progress_ = assetModel;
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(assetModel);
                }
                return this;
            }

            public Builder mergeVideoAsset(AssetModel assetModel) {
                SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> singleFieldBuilderV3 = this.videoAssetBuilder_;
                if (singleFieldBuilderV3 == null) {
                    AssetModel assetModel2 = this.videoAsset_;
                    if (assetModel2 != null) {
                        this.videoAsset_ = AssetModel.newBuilder(assetModel2).mergeFrom(assetModel).buildPartial();
                    } else {
                        this.videoAsset_ = assetModel;
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(assetModel);
                }
                return this;
            }

            public Builder setAutorotate(boolean z) {
                this.autorotate_ = z;
                onChanged();
                return this;
            }

            public Builder setBackgroundColor(String str) {
                str.getClass();
                this.backgroundColor_ = str;
                onChanged();
                return this;
            }

            public Builder setBackgroundColorBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.backgroundColor_ = byteString;
                onChanged();
                return this;
            }

            public Builder setClosableView(AssetModel assetModel) {
                SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> singleFieldBuilderV3 = this.closableViewBuilder_;
                if (singleFieldBuilderV3 == null) {
                    assetModel.getClass();
                    this.closableView_ = assetModel;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(assetModel);
                }
                return this;
            }

            public Builder setCloseTime(float f) {
                this.closeTime_ = f;
                onChanged();
                return this;
            }

            public Builder setCountdown(AssetModel assetModel) {
                SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> singleFieldBuilderV3 = this.countdownBuilder_;
                if (singleFieldBuilderV3 == null) {
                    assetModel.getClass();
                    this.countdown_ = assetModel;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(assetModel);
                }
                return this;
            }

            public Builder setCta(AssetModel assetModel) {
                SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> singleFieldBuilderV3 = this.ctaBuilder_;
                if (singleFieldBuilderV3 == null) {
                    assetModel.getClass();
                    this.cta_ = assetModel;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(assetModel);
                }
                return this;
            }

            public Builder setDuration(int i) {
                this.duration_ = i;
                onChanged();
                return this;
            }

            public Builder setIgnoresSafeAreaLayoutGuide(boolean z) {
                this.ignoresSafeAreaLayoutGuide_ = z;
                onChanged();
                return this;
            }

            public Builder setMuteAsset(AssetModel assetModel) {
                SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> singleFieldBuilderV3 = this.muteAssetBuilder_;
                if (singleFieldBuilderV3 == null) {
                    assetModel.getClass();
                    this.muteAsset_ = assetModel;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(assetModel);
                }
                return this;
            }

            public Builder setProgress(AssetModel assetModel) {
                SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> singleFieldBuilderV3 = this.progressBuilder_;
                if (singleFieldBuilderV3 == null) {
                    assetModel.getClass();
                    this.progress_ = assetModel;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(assetModel);
                }
                return this;
            }

            public Builder setUseCustomClose(boolean z) {
                this.useCustomClose_ = z;
                onChanged();
                return this;
            }

            public Builder setVideoAsset(AssetModel assetModel) {
                SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> singleFieldBuilderV3 = this.videoAssetBuilder_;
                if (singleFieldBuilderV3 == null) {
                    assetModel.getClass();
                    this.videoAsset_ = assetModel;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(assetModel);
                }
                return this;
            }

            private Builder() {
                this.backgroundColor_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public AssetAppearance build() {
                AssetAppearance buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public AssetAppearance buildPartial() {
                AssetAppearance assetAppearance = new AssetAppearance(this);
                assetAppearance.closeTime_ = this.closeTime_;
                assetAppearance.duration_ = this.duration_;
                assetAppearance.ignoresSafeAreaLayoutGuide_ = this.ignoresSafeAreaLayoutGuide_;
                assetAppearance.useCustomClose_ = this.useCustomClose_;
                assetAppearance.autorotate_ = this.autorotate_;
                SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> singleFieldBuilderV3 = this.countdownBuilder_;
                if (singleFieldBuilderV3 == null) {
                    assetAppearance.countdown_ = this.countdown_;
                } else {
                    assetAppearance.countdown_ = singleFieldBuilderV3.build();
                }
                SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> singleFieldBuilderV32 = this.closableViewBuilder_;
                if (singleFieldBuilderV32 == null) {
                    assetAppearance.closableView_ = this.closableView_;
                } else {
                    assetAppearance.closableView_ = singleFieldBuilderV32.build();
                }
                SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> singleFieldBuilderV33 = this.progressBuilder_;
                if (singleFieldBuilderV33 == null) {
                    assetAppearance.progress_ = this.progress_;
                } else {
                    assetAppearance.progress_ = singleFieldBuilderV33.build();
                }
                SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> singleFieldBuilderV34 = this.ctaBuilder_;
                if (singleFieldBuilderV34 == null) {
                    assetAppearance.cta_ = this.cta_;
                } else {
                    assetAppearance.cta_ = singleFieldBuilderV34.build();
                }
                SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> singleFieldBuilderV35 = this.muteAssetBuilder_;
                if (singleFieldBuilderV35 == null) {
                    assetAppearance.muteAsset_ = this.muteAsset_;
                } else {
                    assetAppearance.muteAsset_ = singleFieldBuilderV35.build();
                }
                SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> singleFieldBuilderV36 = this.videoAssetBuilder_;
                if (singleFieldBuilderV36 == null) {
                    assetAppearance.videoAsset_ = this.videoAsset_;
                } else {
                    assetAppearance.videoAsset_ = singleFieldBuilderV36.build();
                }
                assetAppearance.backgroundColor_ = this.backgroundColor_;
                onBuilt();
                return assetAppearance;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
            public AssetAppearance getDefaultInstanceForType() {
                return AssetAppearance.getDefaultInstance();
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.closeTime_ = 0.0f;
                this.duration_ = 0;
                this.ignoresSafeAreaLayoutGuide_ = false;
                this.useCustomClose_ = false;
                this.autorotate_ = false;
                if (this.countdownBuilder_ == null) {
                    this.countdown_ = null;
                } else {
                    this.countdown_ = null;
                    this.countdownBuilder_ = null;
                }
                if (this.closableViewBuilder_ == null) {
                    this.closableView_ = null;
                } else {
                    this.closableView_ = null;
                    this.closableViewBuilder_ = null;
                }
                if (this.progressBuilder_ == null) {
                    this.progress_ = null;
                } else {
                    this.progress_ = null;
                    this.progressBuilder_ = null;
                }
                if (this.ctaBuilder_ == null) {
                    this.cta_ = null;
                } else {
                    this.cta_ = null;
                    this.ctaBuilder_ = null;
                }
                if (this.muteAssetBuilder_ == null) {
                    this.muteAsset_ = null;
                } else {
                    this.muteAsset_ = null;
                    this.muteAssetBuilder_ = null;
                }
                if (this.videoAssetBuilder_ == null) {
                    this.videoAsset_ = null;
                } else {
                    this.videoAsset_ = null;
                    this.videoAssetBuilder_ = null;
                }
                this.backgroundColor_ = "";
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.backgroundColor_ = "";
                maybeForceBuilderInitialization();
            }

            public Builder setClosableView(AssetModel.Builder builder) {
                SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> singleFieldBuilderV3 = this.closableViewBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.closableView_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                return this;
            }

            public Builder setCountdown(AssetModel.Builder builder) {
                SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> singleFieldBuilderV3 = this.countdownBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.countdown_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                return this;
            }

            public Builder setCta(AssetModel.Builder builder) {
                SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> singleFieldBuilderV3 = this.ctaBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.cta_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                return this;
            }

            public Builder setMuteAsset(AssetModel.Builder builder) {
                SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> singleFieldBuilderV3 = this.muteAssetBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.muteAsset_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                return this;
            }

            public Builder setProgress(AssetModel.Builder builder) {
                SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> singleFieldBuilderV3 = this.progressBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.progress_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                return this;
            }

            public Builder setVideoAsset(AssetModel.Builder builder) {
                SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> singleFieldBuilderV3 = this.videoAssetBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.videoAsset_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                return this;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo110022clone() {
                return (Builder) super.mo110022clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof AssetAppearance) {
                    return mergeFrom((AssetAppearance) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(AssetAppearance assetAppearance) {
                if (assetAppearance == AssetAppearance.getDefaultInstance()) {
                    return this;
                }
                if (assetAppearance.getCloseTime() != 0.0f) {
                    setCloseTime(assetAppearance.getCloseTime());
                }
                if (assetAppearance.getDuration() != 0) {
                    setDuration(assetAppearance.getDuration());
                }
                if (assetAppearance.getIgnoresSafeAreaLayoutGuide()) {
                    setIgnoresSafeAreaLayoutGuide(assetAppearance.getIgnoresSafeAreaLayoutGuide());
                }
                if (assetAppearance.getUseCustomClose()) {
                    setUseCustomClose(assetAppearance.getUseCustomClose());
                }
                if (assetAppearance.getAutorotate()) {
                    setAutorotate(assetAppearance.getAutorotate());
                }
                if (assetAppearance.hasCountdown()) {
                    mergeCountdown(assetAppearance.getCountdown());
                }
                if (assetAppearance.hasClosableView()) {
                    mergeClosableView(assetAppearance.getClosableView());
                }
                if (assetAppearance.hasProgress()) {
                    mergeProgress(assetAppearance.getProgress());
                }
                if (assetAppearance.hasCta()) {
                    mergeCta(assetAppearance.getCta());
                }
                if (assetAppearance.hasMuteAsset()) {
                    mergeMuteAsset(assetAppearance.getMuteAsset());
                }
                if (assetAppearance.hasVideoAsset()) {
                    mergeVideoAsset(assetAppearance.getVideoAsset());
                }
                if (!assetAppearance.getBackgroundColor().isEmpty()) {
                    this.backgroundColor_ = assetAppearance.backgroundColor_;
                    onChanged();
                }
                mergeUnknownFields(((GeneratedMessageV3) assetAppearance).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.AbstractMessageLite.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public io.bidmachine.protobuf.CreativeExtension.AssetAppearance.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.Parser r1 = io.bidmachine.protobuf.CreativeExtension.AssetAppearance.access$4800()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.CreativeExtension$AssetAppearance r3 = (io.bidmachine.protobuf.CreativeExtension.AssetAppearance) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    if (r3 == 0) goto L10
                    r2.mergeFrom(r3)
                L10:
                    return r2
                L11:
                    r3 = move-exception
                    goto L21
                L13:
                    r3 = move-exception
                    com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> L11
                    io.bidmachine.protobuf.CreativeExtension$AssetAppearance r4 = (io.bidmachine.protobuf.CreativeExtension.AssetAppearance) r4     // Catch: java.lang.Throwable -> L11
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1f
                    throw r3     // Catch: java.lang.Throwable -> L1f
                L1f:
                    r3 = move-exception
                    r0 = r4
                L21:
                    if (r0 == 0) goto L26
                    r2.mergeFrom(r0)
                L26:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.CreativeExtension.AssetAppearance.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):io.bidmachine.protobuf.CreativeExtension$AssetAppearance$Builder");
            }
        }

        public static Builder newBuilder(AssetAppearance assetAppearance) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(assetAppearance);
        }

        public static AssetAppearance parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        private AssetAppearance(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AssetAppearance parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AssetAppearance) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AssetAppearance parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
        public AssetAppearance getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static AssetAppearance parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private AssetAppearance() {
            this.memoizedIsInitialized = (byte) -1;
            this.backgroundColor_ = "";
        }

        public static AssetAppearance parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static AssetAppearance parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static AssetAppearance parseFrom(InputStream inputStream) throws IOException {
            return (AssetAppearance) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private AssetAppearance(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            AssetModel.Builder builder;
            extensionRegistryLite.getClass();
            UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        try {
                            int readTag = codedInputStream.readTag();
                            switch (readTag) {
                                case 0:
                                    break;
                                case 13:
                                    this.closeTime_ = codedInputStream.readFloat();
                                    continue;
                                case 16:
                                    this.duration_ = codedInputStream.readUInt32();
                                    continue;
                                case 24:
                                    this.ignoresSafeAreaLayoutGuide_ = codedInputStream.readBool();
                                    continue;
                                case 32:
                                    this.useCustomClose_ = codedInputStream.readBool();
                                    continue;
                                case 40:
                                    this.autorotate_ = codedInputStream.readBool();
                                    continue;
                                case 50:
                                    AssetModel assetModel = this.countdown_;
                                    builder = assetModel != null ? assetModel.toBuilder() : null;
                                    AssetModel assetModel2 = (AssetModel) codedInputStream.readMessage(AssetModel.parser(), extensionRegistryLite);
                                    this.countdown_ = assetModel2;
                                    if (builder != null) {
                                        builder.mergeFrom(assetModel2);
                                        this.countdown_ = builder.buildPartial();
                                    } else {
                                        continue;
                                    }
                                case 58:
                                    AssetModel assetModel3 = this.closableView_;
                                    builder = assetModel3 != null ? assetModel3.toBuilder() : null;
                                    AssetModel assetModel4 = (AssetModel) codedInputStream.readMessage(AssetModel.parser(), extensionRegistryLite);
                                    this.closableView_ = assetModel4;
                                    if (builder != null) {
                                        builder.mergeFrom(assetModel4);
                                        this.closableView_ = builder.buildPartial();
                                    } else {
                                        continue;
                                    }
                                case 66:
                                    AssetModel assetModel5 = this.progress_;
                                    builder = assetModel5 != null ? assetModel5.toBuilder() : null;
                                    AssetModel assetModel6 = (AssetModel) codedInputStream.readMessage(AssetModel.parser(), extensionRegistryLite);
                                    this.progress_ = assetModel6;
                                    if (builder != null) {
                                        builder.mergeFrom(assetModel6);
                                        this.progress_ = builder.buildPartial();
                                    } else {
                                        continue;
                                    }
                                case 74:
                                    AssetModel assetModel7 = this.cta_;
                                    builder = assetModel7 != null ? assetModel7.toBuilder() : null;
                                    AssetModel assetModel8 = (AssetModel) codedInputStream.readMessage(AssetModel.parser(), extensionRegistryLite);
                                    this.cta_ = assetModel8;
                                    if (builder != null) {
                                        builder.mergeFrom(assetModel8);
                                        this.cta_ = builder.buildPartial();
                                    } else {
                                        continue;
                                    }
                                case 82:
                                    AssetModel assetModel9 = this.muteAsset_;
                                    builder = assetModel9 != null ? assetModel9.toBuilder() : null;
                                    AssetModel assetModel10 = (AssetModel) codedInputStream.readMessage(AssetModel.parser(), extensionRegistryLite);
                                    this.muteAsset_ = assetModel10;
                                    if (builder != null) {
                                        builder.mergeFrom(assetModel10);
                                        this.muteAsset_ = builder.buildPartial();
                                    } else {
                                        continue;
                                    }
                                case 90:
                                    AssetModel assetModel11 = this.videoAsset_;
                                    builder = assetModel11 != null ? assetModel11.toBuilder() : null;
                                    AssetModel assetModel12 = (AssetModel) codedInputStream.readMessage(AssetModel.parser(), extensionRegistryLite);
                                    this.videoAsset_ = assetModel12;
                                    if (builder != null) {
                                        builder.mergeFrom(assetModel12);
                                        this.videoAsset_ = builder.buildPartial();
                                    } else {
                                        continue;
                                    }
                                case 98:
                                    this.backgroundColor_ = codedInputStream.readStringRequireUtf8();
                                    continue;
                                default:
                                    if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                        break;
                                    } else {
                                        continue;
                                    }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.setUnfinishedMessage(this);
                        }
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    }
                } finally {
                    this.unknownFields = newBuilder.build();
                    makeExtensionsImmutable();
                }
            }
        }

        public static AssetAppearance parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AssetAppearance) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AssetAppearance parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (AssetAppearance) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static AssetAppearance parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AssetAppearance) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    /* loaded from: classes9.dex */
    public interface AssetAppearanceOrBuilder extends MessageOrBuilder {
        boolean getAutorotate();

        String getBackgroundColor();

        ByteString getBackgroundColorBytes();

        AssetModel getClosableView();

        AssetModelOrBuilder getClosableViewOrBuilder();

        float getCloseTime();

        AssetModel getCountdown();

        AssetModelOrBuilder getCountdownOrBuilder();

        AssetModel getCta();

        AssetModelOrBuilder getCtaOrBuilder();

        int getDuration();

        boolean getIgnoresSafeAreaLayoutGuide();

        AssetModel getMuteAsset();

        AssetModelOrBuilder getMuteAssetOrBuilder();

        AssetModel getProgress();

        AssetModelOrBuilder getProgressOrBuilder();

        boolean getUseCustomClose();

        AssetModel getVideoAsset();

        AssetModelOrBuilder getVideoAssetOrBuilder();

        boolean hasClosableView();

        boolean hasCountdown();

        boolean hasCta();

        boolean hasMuteAsset();

        boolean hasProgress();

        boolean hasVideoAsset();
    }

    /* loaded from: classes9.dex */
    public static final class AssetModel extends GeneratedMessageV3 implements AssetModelOrBuilder {
        public static final int CONTENT_FIELD_NUMBER = 1;
        public static final int FILL_FIELD_NUMBER = 2;
        public static final int FONT_STYLE_FIELD_NUMBER = 3;
        public static final int HEIGHT_FIELD_NUMBER = 4;
        public static final int HIDEAFTER_FIELD_NUMBER = 5;
        public static final int MARGIN_FIELD_NUMBER = 6;
        public static final int OPACITY_FIELD_NUMBER = 7;
        public static final int OUTLINED_FIELD_NUMBER = 8;
        public static final int PADDING_FIELD_NUMBER = 9;
        public static final int SHADOW_FIELD_NUMBER = 10;
        public static final int STROKE_FIELD_NUMBER = 11;
        public static final int STROKE_WIDTH_FIELD_NUMBER = 18;
        public static final int STYLE_FIELD_NUMBER = 13;
        public static final int VISIBLE_FIELD_NUMBER = 14;
        public static final int WIDTH_FIELD_NUMBER = 15;
        public static final int X_FIELD_NUMBER = 16;
        public static final int Y_FIELD_NUMBER = 17;
        private static final long serialVersionUID = 0;
        private volatile Object content_;
        private volatile Object fill_;
        private int fontStyle_;
        private int height_;
        private int hideafter_;
        private float margin_;
        private byte memoizedIsInitialized;
        private float opacity_;
        private boolean outlined_;
        private float padding_;
        private volatile Object shadow_;
        private float strokeWidth_;
        private volatile Object stroke_;
        private volatile Object style_;
        private boolean visible_;
        private int width_;

        /* renamed from: x_ */
        private volatile Object f97382x_;

        /* renamed from: y_ */
        private volatile Object f97383y_;
        private static final AssetModel DEFAULT_INSTANCE = new AssetModel();
        private static final Parser<AssetModel> PARSER = new AbstractParser<AssetModel>() { // from class: io.bidmachine.protobuf.CreativeExtension.AssetModel.1
            @Override // com.explorestack.protobuf.Parser
            public AssetModel parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new AssetModel(codedInputStream, extensionRegistryLite);
            }
        };

        public static AssetModel getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ExtensionsProto.f97396x78d8fc18;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AssetModel parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AssetModel) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AssetModel parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<AssetModel> parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AssetModel)) {
                return super.equals(obj);
            }
            AssetModel assetModel = (AssetModel) obj;
            if (getContent().equals(assetModel.getContent()) && getFill().equals(assetModel.getFill()) && getFontStyle() == assetModel.getFontStyle() && getHeight() == assetModel.getHeight() && getHideafter() == assetModel.getHideafter() && Float.floatToIntBits(getMargin()) == Float.floatToIntBits(assetModel.getMargin()) && Float.floatToIntBits(getOpacity()) == Float.floatToIntBits(assetModel.getOpacity()) && getOutlined() == assetModel.getOutlined() && Float.floatToIntBits(getPadding()) == Float.floatToIntBits(assetModel.getPadding()) && getShadow().equals(assetModel.getShadow()) && getStroke().equals(assetModel.getStroke()) && Float.floatToIntBits(getStrokeWidth()) == Float.floatToIntBits(assetModel.getStrokeWidth()) && getStyle().equals(assetModel.getStyle()) && getVisible() == assetModel.getVisible() && getWidth() == assetModel.getWidth() && getX().equals(assetModel.getX()) && getY().equals(assetModel.getY()) && this.unknownFields.equals(assetModel.unknownFields)) {
                return true;
            }
            return false;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
        public String getContent() {
            Object obj = this.content_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.content_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
        public ByteString getContentBytes() {
            Object obj = this.content_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.content_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
        public String getFill() {
            Object obj = this.fill_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.fill_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
        public ByteString getFillBytes() {
            Object obj = this.fill_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.fill_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
        public int getFontStyle() {
            return this.fontStyle_;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
        public int getHeight() {
            return this.height_;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
        public int getHideafter() {
            return this.hideafter_;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
        public float getMargin() {
            return this.margin_;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
        public float getOpacity() {
            return this.opacity_;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
        public boolean getOutlined() {
            return this.outlined_;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
        public float getPadding() {
            return this.padding_;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Parser<AssetModel> getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (!getContentBytes().isEmpty()) {
                i2 = 0 + GeneratedMessageV3.computeStringSize(1, this.content_);
            }
            if (!getFillBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(2, this.fill_);
            }
            int i3 = this.fontStyle_;
            if (i3 != 0) {
                i2 += CodedOutputStream.computeUInt32Size(3, i3);
            }
            int i4 = this.height_;
            if (i4 != 0) {
                i2 += CodedOutputStream.computeUInt32Size(4, i4);
            }
            int i5 = this.hideafter_;
            if (i5 != 0) {
                i2 += CodedOutputStream.computeUInt32Size(5, i5);
            }
            float f = this.margin_;
            if (f != 0.0f) {
                i2 += CodedOutputStream.computeFloatSize(6, f);
            }
            float f2 = this.opacity_;
            if (f2 != 0.0f) {
                i2 += CodedOutputStream.computeFloatSize(7, f2);
            }
            boolean z = this.outlined_;
            if (z) {
                i2 += CodedOutputStream.computeBoolSize(8, z);
            }
            float f3 = this.padding_;
            if (f3 != 0.0f) {
                i2 += CodedOutputStream.computeFloatSize(9, f3);
            }
            if (!getShadowBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(10, this.shadow_);
            }
            if (!getStrokeBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(11, this.stroke_);
            }
            if (!getStyleBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(13, this.style_);
            }
            boolean z2 = this.visible_;
            if (z2) {
                i2 += CodedOutputStream.computeBoolSize(14, z2);
            }
            int i6 = this.width_;
            if (i6 != 0) {
                i2 += CodedOutputStream.computeUInt32Size(15, i6);
            }
            if (!getXBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(16, this.f97382x_);
            }
            if (!getYBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(17, this.f97383y_);
            }
            float f4 = this.strokeWidth_;
            if (f4 != 0.0f) {
                i2 += CodedOutputStream.computeFloatSize(18, f4);
            }
            int serializedSize = i2 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
        public String getShadow() {
            Object obj = this.shadow_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.shadow_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
        public ByteString getShadowBytes() {
            Object obj = this.shadow_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.shadow_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
        public String getStroke() {
            Object obj = this.stroke_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.stroke_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
        public ByteString getStrokeBytes() {
            Object obj = this.stroke_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.stroke_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
        public float getStrokeWidth() {
            return this.strokeWidth_;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
        public String getStyle() {
            Object obj = this.style_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.style_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
        public ByteString getStyleBytes() {
            Object obj = this.style_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.style_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
        public boolean getVisible() {
            return this.visible_;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
        public int getWidth() {
            return this.width_;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
        public String getX() {
            Object obj = this.f97382x_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f97382x_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
        public ByteString getXBytes() {
            Object obj = this.f97382x_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.f97382x_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
        public String getY() {
            Object obj = this.f97383y_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f97383y_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
        public ByteString getYBytes() {
            Object obj = this.f97383y_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.f97383y_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getContent().hashCode()) * 37) + 2) * 53) + getFill().hashCode()) * 37) + 3) * 53) + getFontStyle()) * 37) + 4) * 53) + getHeight()) * 37) + 5) * 53) + getHideafter()) * 37) + 6) * 53) + Float.floatToIntBits(getMargin())) * 37) + 7) * 53) + Float.floatToIntBits(getOpacity())) * 37) + 8) * 53) + Internal.hashBoolean(getOutlined())) * 37) + 9) * 53) + Float.floatToIntBits(getPadding())) * 37) + 10) * 53) + getShadow().hashCode()) * 37) + 11) * 53) + getStroke().hashCode()) * 37) + 18) * 53) + Float.floatToIntBits(getStrokeWidth())) * 37) + 13) * 53) + getStyle().hashCode()) * 37) + 14) * 53) + Internal.hashBoolean(getVisible())) * 37) + 15) * 53) + getWidth()) * 37) + 16) * 53) + getX().hashCode()) * 37) + 17) * 53) + getY().hashCode()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode;
            return hashCode;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExtensionsProto.f97397x87f68a96.ensureFieldAccessorsInitialized(AssetModel.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new AssetModel();
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!getContentBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.content_);
            }
            if (!getFillBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.fill_);
            }
            int i = this.fontStyle_;
            if (i != 0) {
                codedOutputStream.writeUInt32(3, i);
            }
            int i2 = this.height_;
            if (i2 != 0) {
                codedOutputStream.writeUInt32(4, i2);
            }
            int i3 = this.hideafter_;
            if (i3 != 0) {
                codedOutputStream.writeUInt32(5, i3);
            }
            float f = this.margin_;
            if (f != 0.0f) {
                codedOutputStream.writeFloat(6, f);
            }
            float f2 = this.opacity_;
            if (f2 != 0.0f) {
                codedOutputStream.writeFloat(7, f2);
            }
            boolean z = this.outlined_;
            if (z) {
                codedOutputStream.writeBool(8, z);
            }
            float f3 = this.padding_;
            if (f3 != 0.0f) {
                codedOutputStream.writeFloat(9, f3);
            }
            if (!getShadowBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 10, this.shadow_);
            }
            if (!getStrokeBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 11, this.stroke_);
            }
            if (!getStyleBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 13, this.style_);
            }
            boolean z2 = this.visible_;
            if (z2) {
                codedOutputStream.writeBool(14, z2);
            }
            int i4 = this.width_;
            if (i4 != 0) {
                codedOutputStream.writeUInt32(15, i4);
            }
            if (!getXBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 16, this.f97382x_);
            }
            if (!getYBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 17, this.f97383y_);
            }
            float f4 = this.strokeWidth_;
            if (f4 != 0.0f) {
                codedOutputStream.writeFloat(18, f4);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* loaded from: classes9.dex */
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AssetModelOrBuilder {
            private Object content_;
            private Object fill_;
            private int fontStyle_;
            private int height_;
            private int hideafter_;
            private float margin_;
            private float opacity_;
            private boolean outlined_;
            private float padding_;
            private Object shadow_;
            private float strokeWidth_;
            private Object stroke_;
            private Object style_;
            private boolean visible_;
            private int width_;

            /* renamed from: x_ */
            private Object f97384x_;

            /* renamed from: y_ */
            private Object f97385y_;

            public static final Descriptors.Descriptor getDescriptor() {
                return ExtensionsProto.f97396x78d8fc18;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
            }

            public Builder clearContent() {
                this.content_ = AssetModel.getDefaultInstance().getContent();
                onChanged();
                return this;
            }

            public Builder clearFill() {
                this.fill_ = AssetModel.getDefaultInstance().getFill();
                onChanged();
                return this;
            }

            public Builder clearFontStyle() {
                this.fontStyle_ = 0;
                onChanged();
                return this;
            }

            public Builder clearHeight() {
                this.height_ = 0;
                onChanged();
                return this;
            }

            public Builder clearHideafter() {
                this.hideafter_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMargin() {
                this.margin_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearOpacity() {
                this.opacity_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearOutlined() {
                this.outlined_ = false;
                onChanged();
                return this;
            }

            public Builder clearPadding() {
                this.padding_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearShadow() {
                this.shadow_ = AssetModel.getDefaultInstance().getShadow();
                onChanged();
                return this;
            }

            public Builder clearStroke() {
                this.stroke_ = AssetModel.getDefaultInstance().getStroke();
                onChanged();
                return this;
            }

            public Builder clearStrokeWidth() {
                this.strokeWidth_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearStyle() {
                this.style_ = AssetModel.getDefaultInstance().getStyle();
                onChanged();
                return this;
            }

            public Builder clearVisible() {
                this.visible_ = false;
                onChanged();
                return this;
            }

            public Builder clearWidth() {
                this.width_ = 0;
                onChanged();
                return this;
            }

            public Builder clearX() {
                this.f97384x_ = AssetModel.getDefaultInstance().getX();
                onChanged();
                return this;
            }

            public Builder clearY() {
                this.f97385y_ = AssetModel.getDefaultInstance().getY();
                onChanged();
                return this;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
            public String getContent() {
                Object obj = this.content_;
                if (!(obj instanceof String)) {
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.content_ = stringUtf8;
                    return stringUtf8;
                }
                return (String) obj;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
            public ByteString getContentBytes() {
                Object obj = this.content_;
                if (obj instanceof String) {
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.content_ = copyFromUtf8;
                    return copyFromUtf8;
                }
                return (ByteString) obj;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return ExtensionsProto.f97396x78d8fc18;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
            public String getFill() {
                Object obj = this.fill_;
                if (!(obj instanceof String)) {
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.fill_ = stringUtf8;
                    return stringUtf8;
                }
                return (String) obj;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
            public ByteString getFillBytes() {
                Object obj = this.fill_;
                if (obj instanceof String) {
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.fill_ = copyFromUtf8;
                    return copyFromUtf8;
                }
                return (ByteString) obj;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
            public int getFontStyle() {
                return this.fontStyle_;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
            public int getHeight() {
                return this.height_;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
            public int getHideafter() {
                return this.hideafter_;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
            public float getMargin() {
                return this.margin_;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
            public float getOpacity() {
                return this.opacity_;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
            public boolean getOutlined() {
                return this.outlined_;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
            public float getPadding() {
                return this.padding_;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
            public String getShadow() {
                Object obj = this.shadow_;
                if (!(obj instanceof String)) {
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.shadow_ = stringUtf8;
                    return stringUtf8;
                }
                return (String) obj;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
            public ByteString getShadowBytes() {
                Object obj = this.shadow_;
                if (obj instanceof String) {
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.shadow_ = copyFromUtf8;
                    return copyFromUtf8;
                }
                return (ByteString) obj;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
            public String getStroke() {
                Object obj = this.stroke_;
                if (!(obj instanceof String)) {
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.stroke_ = stringUtf8;
                    return stringUtf8;
                }
                return (String) obj;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
            public ByteString getStrokeBytes() {
                Object obj = this.stroke_;
                if (obj instanceof String) {
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.stroke_ = copyFromUtf8;
                    return copyFromUtf8;
                }
                return (ByteString) obj;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
            public float getStrokeWidth() {
                return this.strokeWidth_;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
            public String getStyle() {
                Object obj = this.style_;
                if (!(obj instanceof String)) {
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.style_ = stringUtf8;
                    return stringUtf8;
                }
                return (String) obj;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
            public ByteString getStyleBytes() {
                Object obj = this.style_;
                if (obj instanceof String) {
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.style_ = copyFromUtf8;
                    return copyFromUtf8;
                }
                return (ByteString) obj;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
            public boolean getVisible() {
                return this.visible_;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
            public int getWidth() {
                return this.width_;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
            public String getX() {
                Object obj = this.f97384x_;
                if (!(obj instanceof String)) {
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.f97384x_ = stringUtf8;
                    return stringUtf8;
                }
                return (String) obj;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
            public ByteString getXBytes() {
                Object obj = this.f97384x_;
                if (obj instanceof String) {
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.f97384x_ = copyFromUtf8;
                    return copyFromUtf8;
                }
                return (ByteString) obj;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
            public String getY() {
                Object obj = this.f97385y_;
                if (!(obj instanceof String)) {
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.f97385y_ = stringUtf8;
                    return stringUtf8;
                }
                return (String) obj;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
            public ByteString getYBytes() {
                Object obj = this.f97385y_;
                if (obj instanceof String) {
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.f97385y_ = copyFromUtf8;
                    return copyFromUtf8;
                }
                return (ByteString) obj;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
            protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return ExtensionsProto.f97397x87f68a96.ensureFieldAccessorsInitialized(AssetModel.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setContent(String str) {
                str.getClass();
                this.content_ = str;
                onChanged();
                return this;
            }

            public Builder setContentBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.content_ = byteString;
                onChanged();
                return this;
            }

            public Builder setFill(String str) {
                str.getClass();
                this.fill_ = str;
                onChanged();
                return this;
            }

            public Builder setFillBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.fill_ = byteString;
                onChanged();
                return this;
            }

            public Builder setFontStyle(int i) {
                this.fontStyle_ = i;
                onChanged();
                return this;
            }

            public Builder setHeight(int i) {
                this.height_ = i;
                onChanged();
                return this;
            }

            public Builder setHideafter(int i) {
                this.hideafter_ = i;
                onChanged();
                return this;
            }

            public Builder setMargin(float f) {
                this.margin_ = f;
                onChanged();
                return this;
            }

            public Builder setOpacity(float f) {
                this.opacity_ = f;
                onChanged();
                return this;
            }

            public Builder setOutlined(boolean z) {
                this.outlined_ = z;
                onChanged();
                return this;
            }

            public Builder setPadding(float f) {
                this.padding_ = f;
                onChanged();
                return this;
            }

            public Builder setShadow(String str) {
                str.getClass();
                this.shadow_ = str;
                onChanged();
                return this;
            }

            public Builder setShadowBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.shadow_ = byteString;
                onChanged();
                return this;
            }

            public Builder setStroke(String str) {
                str.getClass();
                this.stroke_ = str;
                onChanged();
                return this;
            }

            public Builder setStrokeBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.stroke_ = byteString;
                onChanged();
                return this;
            }

            public Builder setStrokeWidth(float f) {
                this.strokeWidth_ = f;
                onChanged();
                return this;
            }

            public Builder setStyle(String str) {
                str.getClass();
                this.style_ = str;
                onChanged();
                return this;
            }

            public Builder setStyleBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.style_ = byteString;
                onChanged();
                return this;
            }

            public Builder setVisible(boolean z) {
                this.visible_ = z;
                onChanged();
                return this;
            }

            public Builder setWidth(int i) {
                this.width_ = i;
                onChanged();
                return this;
            }

            public Builder setX(String str) {
                str.getClass();
                this.f97384x_ = str;
                onChanged();
                return this;
            }

            public Builder setXBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.f97384x_ = byteString;
                onChanged();
                return this;
            }

            public Builder setY(String str) {
                str.getClass();
                this.f97385y_ = str;
                onChanged();
                return this;
            }

            public Builder setYBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.f97385y_ = byteString;
                onChanged();
                return this;
            }

            private Builder() {
                this.content_ = "";
                this.fill_ = "";
                this.shadow_ = "";
                this.stroke_ = "";
                this.style_ = "";
                this.f97384x_ = "";
                this.f97385y_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public AssetModel build() {
                AssetModel buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public AssetModel buildPartial() {
                AssetModel assetModel = new AssetModel(this);
                assetModel.content_ = this.content_;
                assetModel.fill_ = this.fill_;
                assetModel.fontStyle_ = this.fontStyle_;
                assetModel.height_ = this.height_;
                assetModel.hideafter_ = this.hideafter_;
                assetModel.margin_ = this.margin_;
                assetModel.opacity_ = this.opacity_;
                assetModel.outlined_ = this.outlined_;
                assetModel.padding_ = this.padding_;
                assetModel.shadow_ = this.shadow_;
                assetModel.stroke_ = this.stroke_;
                assetModel.strokeWidth_ = this.strokeWidth_;
                assetModel.style_ = this.style_;
                assetModel.visible_ = this.visible_;
                assetModel.width_ = this.width_;
                assetModel.f97382x_ = this.f97384x_;
                assetModel.f97383y_ = this.f97385y_;
                onBuilt();
                return assetModel;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
            public AssetModel getDefaultInstanceForType() {
                return AssetModel.getDefaultInstance();
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.content_ = "";
                this.fill_ = "";
                this.fontStyle_ = 0;
                this.height_ = 0;
                this.hideafter_ = 0;
                this.margin_ = 0.0f;
                this.opacity_ = 0.0f;
                this.outlined_ = false;
                this.padding_ = 0.0f;
                this.shadow_ = "";
                this.stroke_ = "";
                this.strokeWidth_ = 0.0f;
                this.style_ = "";
                this.visible_ = false;
                this.width_ = 0;
                this.f97384x_ = "";
                this.f97385y_ = "";
                return this;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo110022clone() {
                return (Builder) super.mo110022clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof AssetModel) {
                    return mergeFrom((AssetModel) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(AssetModel assetModel) {
                if (assetModel == AssetModel.getDefaultInstance()) {
                    return this;
                }
                if (!assetModel.getContent().isEmpty()) {
                    this.content_ = assetModel.content_;
                    onChanged();
                }
                if (!assetModel.getFill().isEmpty()) {
                    this.fill_ = assetModel.fill_;
                    onChanged();
                }
                if (assetModel.getFontStyle() != 0) {
                    setFontStyle(assetModel.getFontStyle());
                }
                if (assetModel.getHeight() != 0) {
                    setHeight(assetModel.getHeight());
                }
                if (assetModel.getHideafter() != 0) {
                    setHideafter(assetModel.getHideafter());
                }
                if (assetModel.getMargin() != 0.0f) {
                    setMargin(assetModel.getMargin());
                }
                if (assetModel.getOpacity() != 0.0f) {
                    setOpacity(assetModel.getOpacity());
                }
                if (assetModel.getOutlined()) {
                    setOutlined(assetModel.getOutlined());
                }
                if (assetModel.getPadding() != 0.0f) {
                    setPadding(assetModel.getPadding());
                }
                if (!assetModel.getShadow().isEmpty()) {
                    this.shadow_ = assetModel.shadow_;
                    onChanged();
                }
                if (!assetModel.getStroke().isEmpty()) {
                    this.stroke_ = assetModel.stroke_;
                    onChanged();
                }
                if (assetModel.getStrokeWidth() != 0.0f) {
                    setStrokeWidth(assetModel.getStrokeWidth());
                }
                if (!assetModel.getStyle().isEmpty()) {
                    this.style_ = assetModel.style_;
                    onChanged();
                }
                if (assetModel.getVisible()) {
                    setVisible(assetModel.getVisible());
                }
                if (assetModel.getWidth() != 0) {
                    setWidth(assetModel.getWidth());
                }
                if (!assetModel.getX().isEmpty()) {
                    this.f97384x_ = assetModel.f97382x_;
                    onChanged();
                }
                if (!assetModel.getY().isEmpty()) {
                    this.f97385y_ = assetModel.f97383y_;
                    onChanged();
                }
                mergeUnknownFields(((GeneratedMessageV3) assetModel).unknownFields);
                onChanged();
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.content_ = "";
                this.fill_ = "";
                this.shadow_ = "";
                this.stroke_ = "";
                this.style_ = "";
                this.f97384x_ = "";
                this.f97385y_ = "";
                maybeForceBuilderInitialization();
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.AbstractMessageLite.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public io.bidmachine.protobuf.CreativeExtension.AssetModel.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.Parser r1 = io.bidmachine.protobuf.CreativeExtension.AssetModel.access$2200()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.CreativeExtension$AssetModel r3 = (io.bidmachine.protobuf.CreativeExtension.AssetModel) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    if (r3 == 0) goto L10
                    r2.mergeFrom(r3)
                L10:
                    return r2
                L11:
                    r3 = move-exception
                    goto L21
                L13:
                    r3 = move-exception
                    com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> L11
                    io.bidmachine.protobuf.CreativeExtension$AssetModel r4 = (io.bidmachine.protobuf.CreativeExtension.AssetModel) r4     // Catch: java.lang.Throwable -> L11
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1f
                    throw r3     // Catch: java.lang.Throwable -> L1f
                L1f:
                    r3 = move-exception
                    r0 = r4
                L21:
                    if (r0 == 0) goto L26
                    r2.mergeFrom(r0)
                L26:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.CreativeExtension.AssetModel.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):io.bidmachine.protobuf.CreativeExtension$AssetModel$Builder");
            }
        }

        public static Builder newBuilder(AssetModel assetModel) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(assetModel);
        }

        public static AssetModel parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        private AssetModel(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AssetModel parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AssetModel) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AssetModel parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
        public AssetModel getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static AssetModel parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private AssetModel() {
            this.memoizedIsInitialized = (byte) -1;
            this.content_ = "";
            this.fill_ = "";
            this.shadow_ = "";
            this.stroke_ = "";
            this.style_ = "";
            this.f97382x_ = "";
            this.f97383y_ = "";
        }

        public static AssetModel parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static AssetModel parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static AssetModel parseFrom(InputStream inputStream) throws IOException {
            return (AssetModel) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static AssetModel parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AssetModel) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AssetModel parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (AssetModel) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static AssetModel parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AssetModel) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private AssetModel(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            extensionRegistryLite.getClass();
            UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int readTag = codedInputStream.readTag();
                        switch (readTag) {
                            case 0:
                                break;
                            case 10:
                                this.content_ = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 18:
                                this.fill_ = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 24:
                                this.fontStyle_ = codedInputStream.readUInt32();
                                continue;
                            case 32:
                                this.height_ = codedInputStream.readUInt32();
                                continue;
                            case 40:
                                this.hideafter_ = codedInputStream.readUInt32();
                                continue;
                            case 53:
                                this.margin_ = codedInputStream.readFloat();
                                continue;
                            case 61:
                                this.opacity_ = codedInputStream.readFloat();
                                continue;
                            case 64:
                                this.outlined_ = codedInputStream.readBool();
                                continue;
                            case 77:
                                this.padding_ = codedInputStream.readFloat();
                                continue;
                            case 82:
                                this.shadow_ = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 90:
                                this.stroke_ = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 106:
                                this.style_ = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 112:
                                this.visible_ = codedInputStream.readBool();
                                continue;
                            case 120:
                                this.width_ = codedInputStream.readUInt32();
                                continue;
                            case 130:
                                this.f97382x_ = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 138:
                                this.f97383y_ = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 149:
                                this.strokeWidth_ = codedInputStream.readFloat();
                                continue;
                            default:
                                if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                    break;
                                } else {
                                    continue;
                                }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    }
                } finally {
                    this.unknownFields = newBuilder.build();
                    makeExtensionsImmutable();
                }
            }
        }
    }

    /* loaded from: classes9.dex */
    public interface AssetModelOrBuilder extends MessageOrBuilder {
        String getContent();

        ByteString getContentBytes();

        String getFill();

        ByteString getFillBytes();

        int getFontStyle();

        int getHeight();

        int getHideafter();

        float getMargin();

        float getOpacity();

        boolean getOutlined();

        float getPadding();

        String getShadow();

        ByteString getShadowBytes();

        String getStroke();

        ByteString getStrokeBytes();

        float getStrokeWidth();

        String getStyle();

        ByteString getStyleBytes();

        boolean getVisible();

        int getWidth();

        String getX();

        ByteString getXBytes();

        String getY();

        ByteString getYBytes();
    }

    /* loaded from: classes9.dex */
    public static final class Feature extends GeneratedMessageV3 implements FeatureOrBuilder {
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int VALUE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private volatile Object name_;
        private volatile Object value_;
        private static final Feature DEFAULT_INSTANCE = new Feature();
        private static final Parser<Feature> PARSER = new AbstractParser<Feature>() { // from class: io.bidmachine.protobuf.CreativeExtension.Feature.1
            @Override // com.explorestack.protobuf.Parser
            public Feature parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Feature(codedInputStream, extensionRegistryLite);
            }
        };

        public static Feature getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ExtensionsProto.f97398x1afb2475;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Feature parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Feature) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Feature parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<Feature> parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Feature)) {
                return super.equals(obj);
            }
            Feature feature = (Feature) obj;
            if (getName().equals(feature.getName()) && getValue().equals(feature.getValue()) && this.unknownFields.equals(feature.unknownFields)) {
                return true;
            }
            return false;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.FeatureOrBuilder
        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.name_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.FeatureOrBuilder
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.name_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Parser<Feature> getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (!getNameBytes().isEmpty()) {
                i2 = 0 + GeneratedMessageV3.computeStringSize(1, this.name_);
            }
            if (!getValueBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(2, this.value_);
            }
            int serializedSize = i2 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.FeatureOrBuilder
        public String getValue() {
            Object obj = this.value_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.value_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.FeatureOrBuilder
        public ByteString getValueBytes() {
            Object obj = this.value_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.value_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getName().hashCode()) * 37) + 2) * 53) + getValue().hashCode()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode;
            return hashCode;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExtensionsProto.f97399x764d05f3.ensureFieldAccessorsInitialized(Feature.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Feature();
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!getNameBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.name_);
            }
            if (!getValueBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.value_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* loaded from: classes9.dex */
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements FeatureOrBuilder {
            private Object name_;
            private Object value_;

            public static final Descriptors.Descriptor getDescriptor() {
                return ExtensionsProto.f97398x1afb2475;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
            }

            public Builder clearName() {
                this.name_ = Feature.getDefaultInstance().getName();
                onChanged();
                return this;
            }

            public Builder clearValue() {
                this.value_ = Feature.getDefaultInstance().getValue();
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return ExtensionsProto.f97398x1afb2475;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.FeatureOrBuilder
            public String getName() {
                Object obj = this.name_;
                if (!(obj instanceof String)) {
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.name_ = stringUtf8;
                    return stringUtf8;
                }
                return (String) obj;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.FeatureOrBuilder
            public ByteString getNameBytes() {
                Object obj = this.name_;
                if (obj instanceof String) {
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.name_ = copyFromUtf8;
                    return copyFromUtf8;
                }
                return (ByteString) obj;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.FeatureOrBuilder
            public String getValue() {
                Object obj = this.value_;
                if (!(obj instanceof String)) {
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.value_ = stringUtf8;
                    return stringUtf8;
                }
                return (String) obj;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.FeatureOrBuilder
            public ByteString getValueBytes() {
                Object obj = this.value_;
                if (obj instanceof String) {
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.value_ = copyFromUtf8;
                    return copyFromUtf8;
                }
                return (ByteString) obj;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
            protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return ExtensionsProto.f97399x764d05f3.ensureFieldAccessorsInitialized(Feature.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setName(String str) {
                str.getClass();
                this.name_ = str;
                onChanged();
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.name_ = byteString;
                onChanged();
                return this;
            }

            public Builder setValue(String str) {
                str.getClass();
                this.value_ = str;
                onChanged();
                return this;
            }

            public Builder setValueBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.value_ = byteString;
                onChanged();
                return this;
            }

            private Builder() {
                this.name_ = "";
                this.value_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Feature build() {
                Feature buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Feature buildPartial() {
                Feature feature = new Feature(this);
                feature.name_ = this.name_;
                feature.value_ = this.value_;
                onBuilt();
                return feature;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
            public Feature getDefaultInstanceForType() {
                return Feature.getDefaultInstance();
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.name_ = "";
                this.value_ = "";
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.name_ = "";
                this.value_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo110022clone() {
                return (Builder) super.mo110022clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Feature) {
                    return mergeFrom((Feature) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Feature feature) {
                if (feature == Feature.getDefaultInstance()) {
                    return this;
                }
                if (!feature.getName().isEmpty()) {
                    this.name_ = feature.name_;
                    onChanged();
                }
                if (!feature.getValue().isEmpty()) {
                    this.value_ = feature.value_;
                    onChanged();
                }
                mergeUnknownFields(((GeneratedMessageV3) feature).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.AbstractMessageLite.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public io.bidmachine.protobuf.CreativeExtension.Feature.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.Parser r1 = io.bidmachine.protobuf.CreativeExtension.Feature.access$5800()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.CreativeExtension$Feature r3 = (io.bidmachine.protobuf.CreativeExtension.Feature) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    if (r3 == 0) goto L10
                    r2.mergeFrom(r3)
                L10:
                    return r2
                L11:
                    r3 = move-exception
                    goto L21
                L13:
                    r3 = move-exception
                    com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> L11
                    io.bidmachine.protobuf.CreativeExtension$Feature r4 = (io.bidmachine.protobuf.CreativeExtension.Feature) r4     // Catch: java.lang.Throwable -> L11
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1f
                    throw r3     // Catch: java.lang.Throwable -> L1f
                L1f:
                    r3 = move-exception
                    r0 = r4
                L21:
                    if (r0 == 0) goto L26
                    r2.mergeFrom(r0)
                L26:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.CreativeExtension.Feature.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):io.bidmachine.protobuf.CreativeExtension$Feature$Builder");
            }
        }

        public static Builder newBuilder(Feature feature) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(feature);
        }

        public static Feature parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        private Feature(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Feature parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Feature) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Feature parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
        public Feature getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Feature parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Feature() {
            this.memoizedIsInitialized = (byte) -1;
            this.name_ = "";
            this.value_ = "";
        }

        public static Feature parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static Feature parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Feature parseFrom(InputStream inputStream) throws IOException {
            return (Feature) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private Feature(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            extensionRegistryLite.getClass();
            UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 10) {
                                    this.name_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag != 18) {
                                    if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                    }
                                } else {
                                    this.value_ = codedInputStream.readStringRequireUtf8();
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.setUnfinishedMessage(this);
                        }
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    }
                } finally {
                    this.unknownFields = newBuilder.build();
                    makeExtensionsImmutable();
                }
            }
        }

        public static Feature parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Feature) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Feature parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Feature) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Feature parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Feature) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    /* loaded from: classes9.dex */
    public interface FeatureOrBuilder extends MessageOrBuilder {
        String getName();

        ByteString getNameBytes();

        String getValue();

        ByteString getValueBytes();
    }

    /* loaded from: classes9.dex */
    public static final class Postbanner extends GeneratedMessageV3 implements PostbannerOrBuilder {
        public static final int ASSET_FIELD_NUMBER = 3;
        public static final int FEATURES_FIELD_NUMBER = 4;
        public static final int SEQUENCE_FIELD_NUMBER = 2;
        public static final int TPE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private AssetAppearance asset_;
        private List<Feature> features_;
        private byte memoizedIsInitialized;
        private int sequence_;
        private int tpe_;
        private static final Postbanner DEFAULT_INSTANCE = new Postbanner();
        private static final Parser<Postbanner> PARSER = new AbstractParser<Postbanner>() { // from class: io.bidmachine.protobuf.CreativeExtension.Postbanner.1
            @Override // com.explorestack.protobuf.Parser
            public Postbanner parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Postbanner(codedInputStream, extensionRegistryLite);
            }
        };

        public static Postbanner getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ExtensionsProto.f97400xb6405485;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Postbanner parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Postbanner) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Postbanner parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<Postbanner> parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Postbanner)) {
                return super.equals(obj);
            }
            Postbanner postbanner = (Postbanner) obj;
            if (this.tpe_ != postbanner.tpe_ || getSequence() != postbanner.getSequence() || hasAsset() != postbanner.hasAsset()) {
                return false;
            }
            if ((!hasAsset() || getAsset().equals(postbanner.getAsset())) && getFeaturesList().equals(postbanner.getFeaturesList()) && this.unknownFields.equals(postbanner.unknownFields)) {
                return true;
            }
            return false;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.PostbannerOrBuilder
        public AssetAppearance getAsset() {
            AssetAppearance assetAppearance = this.asset_;
            if (assetAppearance == null) {
                return AssetAppearance.getDefaultInstance();
            }
            return assetAppearance;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.PostbannerOrBuilder
        public AssetAppearanceOrBuilder getAssetOrBuilder() {
            return getAsset();
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.PostbannerOrBuilder
        public Feature getFeatures(int i) {
            return this.features_.get(i);
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.PostbannerOrBuilder
        public int getFeaturesCount() {
            return this.features_.size();
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.PostbannerOrBuilder
        public List<Feature> getFeaturesList() {
            return this.features_;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.PostbannerOrBuilder
        public FeatureOrBuilder getFeaturesOrBuilder(int i) {
            return this.features_.get(i);
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.PostbannerOrBuilder
        public List<? extends FeatureOrBuilder> getFeaturesOrBuilderList() {
            return this.features_;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Parser<Postbanner> getParserForType() {
            return PARSER;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.PostbannerOrBuilder
        public int getSequence() {
            return this.sequence_;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i;
            int i2 = this.memoizedSize;
            if (i2 != -1) {
                return i2;
            }
            if (this.tpe_ != PostbannerType.DISABLED.getNumber()) {
                i = CodedOutputStream.computeEnumSize(1, this.tpe_) + 0;
            } else {
                i = 0;
            }
            int i3 = this.sequence_;
            if (i3 != 0) {
                i += CodedOutputStream.computeUInt32Size(2, i3);
            }
            if (this.asset_ != null) {
                i += CodedOutputStream.computeMessageSize(3, getAsset());
            }
            for (int i4 = 0; i4 < this.features_.size(); i4++) {
                i += CodedOutputStream.computeMessageSize(4, this.features_.get(i4));
            }
            int serializedSize = i + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.PostbannerOrBuilder
        public PostbannerType getTpe() {
            PostbannerType valueOf = PostbannerType.valueOf(this.tpe_);
            if (valueOf == null) {
                return PostbannerType.UNRECOGNIZED;
            }
            return valueOf;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.PostbannerOrBuilder
        public int getTpeValue() {
            return this.tpe_;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.PostbannerOrBuilder
        public boolean hasAsset() {
            if (this.asset_ != null) {
                return true;
            }
            return false;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + this.tpe_) * 37) + 2) * 53) + getSequence();
            if (hasAsset()) {
                hashCode = (((hashCode * 37) + 3) * 53) + getAsset().hashCode();
            }
            if (getFeaturesCount() > 0) {
                hashCode = (((hashCode * 37) + 4) * 53) + getFeaturesList().hashCode();
            }
            int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExtensionsProto.f97401x15a92603.ensureFieldAccessorsInitialized(Postbanner.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Postbanner();
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.tpe_ != PostbannerType.DISABLED.getNumber()) {
                codedOutputStream.writeEnum(1, this.tpe_);
            }
            int i = this.sequence_;
            if (i != 0) {
                codedOutputStream.writeUInt32(2, i);
            }
            if (this.asset_ != null) {
                codedOutputStream.writeMessage(3, getAsset());
            }
            for (int i2 = 0; i2 < this.features_.size(); i2++) {
                codedOutputStream.writeMessage(4, this.features_.get(i2));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        /* loaded from: classes9.dex */
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PostbannerOrBuilder {
            private SingleFieldBuilderV3<AssetAppearance, AssetAppearance.Builder, AssetAppearanceOrBuilder> assetBuilder_;
            private AssetAppearance asset_;
            private int bitField0_;
            private RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> featuresBuilder_;
            private List<Feature> features_;
            private int sequence_;
            private int tpe_;

            private void ensureFeaturesIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.features_ = new ArrayList(this.features_);
                    this.bitField0_ |= 1;
                }
            }

            private SingleFieldBuilderV3<AssetAppearance, AssetAppearance.Builder, AssetAppearanceOrBuilder> getAssetFieldBuilder() {
                if (this.assetBuilder_ == null) {
                    this.assetBuilder_ = new SingleFieldBuilderV3<>(getAsset(), getParentForChildren(), isClean());
                    this.asset_ = null;
                }
                return this.assetBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return ExtensionsProto.f97400xb6405485;
            }

            private RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> getFeaturesFieldBuilder() {
                if (this.featuresBuilder_ == null) {
                    List<Feature> list = this.features_;
                    boolean z = true;
                    if ((this.bitField0_ & 1) == 0) {
                        z = false;
                    }
                    this.featuresBuilder_ = new RepeatedFieldBuilderV3<>(list, z, getParentForChildren(), isClean());
                    this.features_ = null;
                }
                return this.featuresBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getFeaturesFieldBuilder();
                }
            }

            public Builder addAllFeatures(Iterable<? extends Feature> iterable) {
                RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featuresBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureFeaturesIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.features_);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                }
                return this;
            }

            public Builder addFeatures(Feature feature) {
                RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featuresBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    feature.getClass();
                    ensureFeaturesIsMutable();
                    this.features_.add(feature);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(feature);
                }
                return this;
            }

            public Feature.Builder addFeaturesBuilder() {
                return getFeaturesFieldBuilder().addBuilder(Feature.getDefaultInstance());
            }

            public Builder clearAsset() {
                if (this.assetBuilder_ == null) {
                    this.asset_ = null;
                    onChanged();
                } else {
                    this.asset_ = null;
                    this.assetBuilder_ = null;
                }
                return this;
            }

            public Builder clearFeatures() {
                RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featuresBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.features_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                return this;
            }

            public Builder clearSequence() {
                this.sequence_ = 0;
                onChanged();
                return this;
            }

            public Builder clearTpe() {
                this.tpe_ = 0;
                onChanged();
                return this;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.PostbannerOrBuilder
            public AssetAppearance getAsset() {
                SingleFieldBuilderV3<AssetAppearance, AssetAppearance.Builder, AssetAppearanceOrBuilder> singleFieldBuilderV3 = this.assetBuilder_;
                if (singleFieldBuilderV3 == null) {
                    AssetAppearance assetAppearance = this.asset_;
                    if (assetAppearance == null) {
                        return AssetAppearance.getDefaultInstance();
                    }
                    return assetAppearance;
                }
                return singleFieldBuilderV3.getMessage();
            }

            public AssetAppearance.Builder getAssetBuilder() {
                onChanged();
                return getAssetFieldBuilder().getBuilder();
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.PostbannerOrBuilder
            public AssetAppearanceOrBuilder getAssetOrBuilder() {
                SingleFieldBuilderV3<AssetAppearance, AssetAppearance.Builder, AssetAppearanceOrBuilder> singleFieldBuilderV3 = this.assetBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return singleFieldBuilderV3.getMessageOrBuilder();
                }
                AssetAppearance assetAppearance = this.asset_;
                if (assetAppearance == null) {
                    return AssetAppearance.getDefaultInstance();
                }
                return assetAppearance;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return ExtensionsProto.f97400xb6405485;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.PostbannerOrBuilder
            public Feature getFeatures(int i) {
                RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featuresBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.features_.get(i);
                }
                return repeatedFieldBuilderV3.getMessage(i);
            }

            public Feature.Builder getFeaturesBuilder(int i) {
                return getFeaturesFieldBuilder().getBuilder(i);
            }

            public List<Feature.Builder> getFeaturesBuilderList() {
                return getFeaturesFieldBuilder().getBuilderList();
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.PostbannerOrBuilder
            public int getFeaturesCount() {
                RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featuresBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.features_.size();
                }
                return repeatedFieldBuilderV3.getCount();
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.PostbannerOrBuilder
            public List<Feature> getFeaturesList() {
                RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featuresBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return Collections.unmodifiableList(this.features_);
                }
                return repeatedFieldBuilderV3.getMessageList();
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.PostbannerOrBuilder
            public FeatureOrBuilder getFeaturesOrBuilder(int i) {
                RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featuresBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.features_.get(i);
                }
                return repeatedFieldBuilderV3.getMessageOrBuilder(i);
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.PostbannerOrBuilder
            public List<? extends FeatureOrBuilder> getFeaturesOrBuilderList() {
                RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featuresBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    return repeatedFieldBuilderV3.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.features_);
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.PostbannerOrBuilder
            public int getSequence() {
                return this.sequence_;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.PostbannerOrBuilder
            public PostbannerType getTpe() {
                PostbannerType valueOf = PostbannerType.valueOf(this.tpe_);
                if (valueOf == null) {
                    return PostbannerType.UNRECOGNIZED;
                }
                return valueOf;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.PostbannerOrBuilder
            public int getTpeValue() {
                return this.tpe_;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.PostbannerOrBuilder
            public boolean hasAsset() {
                if (this.assetBuilder_ == null && this.asset_ == null) {
                    return false;
                }
                return true;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
            protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return ExtensionsProto.f97401x15a92603.ensureFieldAccessorsInitialized(Postbanner.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeAsset(AssetAppearance assetAppearance) {
                SingleFieldBuilderV3<AssetAppearance, AssetAppearance.Builder, AssetAppearanceOrBuilder> singleFieldBuilderV3 = this.assetBuilder_;
                if (singleFieldBuilderV3 == null) {
                    AssetAppearance assetAppearance2 = this.asset_;
                    if (assetAppearance2 != null) {
                        this.asset_ = AssetAppearance.newBuilder(assetAppearance2).mergeFrom(assetAppearance).buildPartial();
                    } else {
                        this.asset_ = assetAppearance;
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(assetAppearance);
                }
                return this;
            }

            public Builder removeFeatures(int i) {
                RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featuresBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureFeaturesIsMutable();
                    this.features_.remove(i);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.remove(i);
                }
                return this;
            }

            public Builder setAsset(AssetAppearance assetAppearance) {
                SingleFieldBuilderV3<AssetAppearance, AssetAppearance.Builder, AssetAppearanceOrBuilder> singleFieldBuilderV3 = this.assetBuilder_;
                if (singleFieldBuilderV3 == null) {
                    assetAppearance.getClass();
                    this.asset_ = assetAppearance;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(assetAppearance);
                }
                return this;
            }

            public Builder setFeatures(int i, Feature feature) {
                RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featuresBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    feature.getClass();
                    ensureFeaturesIsMutable();
                    this.features_.set(i, feature);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i, feature);
                }
                return this;
            }

            public Builder setSequence(int i) {
                this.sequence_ = i;
                onChanged();
                return this;
            }

            public Builder setTpe(PostbannerType postbannerType) {
                postbannerType.getClass();
                this.tpe_ = postbannerType.getNumber();
                onChanged();
                return this;
            }

            public Builder setTpeValue(int i) {
                this.tpe_ = i;
                onChanged();
                return this;
            }

            private Builder() {
                this.tpe_ = 0;
                this.features_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Postbanner build() {
                Postbanner buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Postbanner buildPartial() {
                Postbanner postbanner = new Postbanner(this);
                postbanner.tpe_ = this.tpe_;
                postbanner.sequence_ = this.sequence_;
                SingleFieldBuilderV3<AssetAppearance, AssetAppearance.Builder, AssetAppearanceOrBuilder> singleFieldBuilderV3 = this.assetBuilder_;
                if (singleFieldBuilderV3 == null) {
                    postbanner.asset_ = this.asset_;
                } else {
                    postbanner.asset_ = singleFieldBuilderV3.build();
                }
                RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featuresBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    postbanner.features_ = repeatedFieldBuilderV3.build();
                } else {
                    if ((this.bitField0_ & 1) != 0) {
                        this.features_ = Collections.unmodifiableList(this.features_);
                        this.bitField0_ &= -2;
                    }
                    postbanner.features_ = this.features_;
                }
                onBuilt();
                return postbanner;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
            public Postbanner getDefaultInstanceForType() {
                return Postbanner.getDefaultInstance();
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public Feature.Builder addFeaturesBuilder(int i) {
                return getFeaturesFieldBuilder().addBuilder(i, Feature.getDefaultInstance());
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.tpe_ = 0;
                this.sequence_ = 0;
                if (this.assetBuilder_ == null) {
                    this.asset_ = null;
                } else {
                    this.asset_ = null;
                    this.assetBuilder_ = null;
                }
                RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featuresBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.features_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                return this;
            }

            public Builder setAsset(AssetAppearance.Builder builder) {
                SingleFieldBuilderV3<AssetAppearance, AssetAppearance.Builder, AssetAppearanceOrBuilder> singleFieldBuilderV3 = this.assetBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.asset_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.tpe_ = 0;
                this.features_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            public Builder addFeatures(int i, Feature feature) {
                RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featuresBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    feature.getClass();
                    ensureFeaturesIsMutable();
                    this.features_.add(i, feature);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(i, feature);
                }
                return this;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo110022clone() {
                return (Builder) super.mo110022clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Postbanner) {
                    return mergeFrom((Postbanner) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setFeatures(int i, Feature.Builder builder) {
                RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featuresBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureFeaturesIsMutable();
                    this.features_.set(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i, builder.build());
                }
                return this;
            }

            public Builder mergeFrom(Postbanner postbanner) {
                if (postbanner == Postbanner.getDefaultInstance()) {
                    return this;
                }
                if (postbanner.tpe_ != 0) {
                    setTpeValue(postbanner.getTpeValue());
                }
                if (postbanner.getSequence() != 0) {
                    setSequence(postbanner.getSequence());
                }
                if (postbanner.hasAsset()) {
                    mergeAsset(postbanner.getAsset());
                }
                if (this.featuresBuilder_ == null) {
                    if (!postbanner.features_.isEmpty()) {
                        if (this.features_.isEmpty()) {
                            this.features_ = postbanner.features_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureFeaturesIsMutable();
                            this.features_.addAll(postbanner.features_);
                        }
                        onChanged();
                    }
                } else if (!postbanner.features_.isEmpty()) {
                    if (!this.featuresBuilder_.isEmpty()) {
                        this.featuresBuilder_.addAllMessages(postbanner.features_);
                    } else {
                        this.featuresBuilder_.dispose();
                        this.featuresBuilder_ = null;
                        this.features_ = postbanner.features_;
                        this.bitField0_ &= -2;
                        this.featuresBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getFeaturesFieldBuilder() : null;
                    }
                }
                mergeUnknownFields(((GeneratedMessageV3) postbanner).unknownFields);
                onChanged();
                return this;
            }

            public Builder addFeatures(Feature.Builder builder) {
                RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featuresBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureFeaturesIsMutable();
                    this.features_.add(builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                }
                return this;
            }

            public Builder addFeatures(int i, Feature.Builder builder) {
                RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featuresBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureFeaturesIsMutable();
                    this.features_.add(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(i, builder.build());
                }
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.AbstractMessageLite.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public io.bidmachine.protobuf.CreativeExtension.Postbanner.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.Parser r1 = io.bidmachine.protobuf.CreativeExtension.Postbanner.access$7200()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.CreativeExtension$Postbanner r3 = (io.bidmachine.protobuf.CreativeExtension.Postbanner) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    if (r3 == 0) goto L10
                    r2.mergeFrom(r3)
                L10:
                    return r2
                L11:
                    r3 = move-exception
                    goto L21
                L13:
                    r3 = move-exception
                    com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> L11
                    io.bidmachine.protobuf.CreativeExtension$Postbanner r4 = (io.bidmachine.protobuf.CreativeExtension.Postbanner) r4     // Catch: java.lang.Throwable -> L11
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1f
                    throw r3     // Catch: java.lang.Throwable -> L1f
                L1f:
                    r3 = move-exception
                    r0 = r4
                L21:
                    if (r0 == 0) goto L26
                    r2.mergeFrom(r0)
                L26:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.CreativeExtension.Postbanner.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):io.bidmachine.protobuf.CreativeExtension$Postbanner$Builder");
            }
        }

        public static Builder newBuilder(Postbanner postbanner) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(postbanner);
        }

        public static Postbanner parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        private Postbanner(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Postbanner parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Postbanner) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Postbanner parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
        public Postbanner getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Postbanner parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Postbanner() {
            this.memoizedIsInitialized = (byte) -1;
            this.tpe_ = 0;
            this.features_ = Collections.emptyList();
        }

        public static Postbanner parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static Postbanner parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Postbanner parseFrom(InputStream inputStream) throws IOException {
            return (Postbanner) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Postbanner(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            extensionRegistryLite.getClass();
            UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 8) {
                                this.tpe_ = codedInputStream.readEnum();
                            } else if (readTag == 16) {
                                this.sequence_ = codedInputStream.readUInt32();
                            } else if (readTag == 26) {
                                AssetAppearance assetAppearance = this.asset_;
                                AssetAppearance.Builder builder = assetAppearance != null ? assetAppearance.toBuilder() : null;
                                AssetAppearance assetAppearance2 = (AssetAppearance) codedInputStream.readMessage(AssetAppearance.parser(), extensionRegistryLite);
                                this.asset_ = assetAppearance2;
                                if (builder != null) {
                                    builder.mergeFrom(assetAppearance2);
                                    this.asset_ = builder.buildPartial();
                                }
                            } else if (readTag != 34) {
                                if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                }
                            } else {
                                if (!(z2 & true)) {
                                    this.features_ = new ArrayList();
                                    z2 |= true;
                                }
                                this.features_.add(codedInputStream.readMessage(Feature.parser(), extensionRegistryLite));
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    }
                } finally {
                    if (z2 & true) {
                        this.features_ = Collections.unmodifiableList(this.features_);
                    }
                    this.unknownFields = newBuilder.build();
                    makeExtensionsImmutable();
                }
            }
        }

        public static Postbanner parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Postbanner) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Postbanner parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Postbanner) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Postbanner parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Postbanner) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    /* loaded from: classes9.dex */
    public interface PostbannerOrBuilder extends MessageOrBuilder {
        AssetAppearance getAsset();

        AssetAppearanceOrBuilder getAssetOrBuilder();

        Feature getFeatures(int i);

        int getFeaturesCount();

        List<Feature> getFeaturesList();

        FeatureOrBuilder getFeaturesOrBuilder(int i);

        List<? extends FeatureOrBuilder> getFeaturesOrBuilderList();

        int getSequence();

        PostbannerType getTpe();

        int getTpeValue();

        boolean hasAsset();
    }

    public static CreativeExtension getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return ExtensionsProto.internal_static_bidmachine_protobuf_CreativeExtension_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static CreativeExtension parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CreativeExtension) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static CreativeExtension parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Parser<CreativeExtension> parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreativeExtension)) {
            return super.equals(obj);
        }
        CreativeExtension creativeExtension = (CreativeExtension) obj;
        if (hasAsset() != creativeExtension.hasAsset()) {
            return false;
        }
        if ((!hasAsset() || getAsset().equals(creativeExtension.getAsset())) && getFeaturesList().equals(creativeExtension.getFeaturesList()) && getPostbannersList().equals(creativeExtension.getPostbannersList()) && this.unknownFields.equals(creativeExtension.unknownFields)) {
            return true;
        }
        return false;
    }

    @Override // io.bidmachine.protobuf.CreativeExtensionOrBuilder
    public AssetAppearance getAsset() {
        AssetAppearance assetAppearance = this.asset_;
        if (assetAppearance == null) {
            return AssetAppearance.getDefaultInstance();
        }
        return assetAppearance;
    }

    @Override // io.bidmachine.protobuf.CreativeExtensionOrBuilder
    public AssetAppearanceOrBuilder getAssetOrBuilder() {
        return getAsset();
    }

    @Override // io.bidmachine.protobuf.CreativeExtensionOrBuilder
    public Feature getFeatures(int i) {
        return this.features_.get(i);
    }

    @Override // io.bidmachine.protobuf.CreativeExtensionOrBuilder
    public int getFeaturesCount() {
        return this.features_.size();
    }

    @Override // io.bidmachine.protobuf.CreativeExtensionOrBuilder
    public List<Feature> getFeaturesList() {
        return this.features_;
    }

    @Override // io.bidmachine.protobuf.CreativeExtensionOrBuilder
    public FeatureOrBuilder getFeaturesOrBuilder(int i) {
        return this.features_.get(i);
    }

    @Override // io.bidmachine.protobuf.CreativeExtensionOrBuilder
    public List<? extends FeatureOrBuilder> getFeaturesOrBuilderList() {
        return this.features_;
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Parser<CreativeExtension> getParserForType() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.CreativeExtensionOrBuilder
    public Postbanner getPostbanners(int i) {
        return this.postbanners_.get(i);
    }

    @Override // io.bidmachine.protobuf.CreativeExtensionOrBuilder
    public int getPostbannersCount() {
        return this.postbanners_.size();
    }

    @Override // io.bidmachine.protobuf.CreativeExtensionOrBuilder
    public List<Postbanner> getPostbannersList() {
        return this.postbanners_;
    }

    @Override // io.bidmachine.protobuf.CreativeExtensionOrBuilder
    public PostbannerOrBuilder getPostbannersOrBuilder(int i) {
        return this.postbanners_.get(i);
    }

    @Override // io.bidmachine.protobuf.CreativeExtensionOrBuilder
    public List<? extends PostbannerOrBuilder> getPostbannersOrBuilderList() {
        return this.postbanners_;
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i;
        int i2 = this.memoizedSize;
        if (i2 != -1) {
            return i2;
        }
        if (this.asset_ != null) {
            i = CodedOutputStream.computeMessageSize(1, getAsset()) + 0;
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < this.features_.size(); i3++) {
            i += CodedOutputStream.computeMessageSize(2, this.features_.get(i3));
        }
        for (int i4 = 0; i4 < this.postbanners_.size(); i4++) {
            i += CodedOutputStream.computeMessageSize(3, this.postbanners_.get(i4));
        }
        int serializedSize = i + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    @Override // io.bidmachine.protobuf.CreativeExtensionOrBuilder
    public boolean hasAsset() {
        if (this.asset_ != null) {
            return true;
        }
        return false;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = 779 + getDescriptor().hashCode();
        if (hasAsset()) {
            hashCode = (((hashCode * 37) + 1) * 53) + getAsset().hashCode();
        }
        if (getFeaturesCount() > 0) {
            hashCode = (((hashCode * 37) + 2) * 53) + getFeaturesList().hashCode();
        }
        if (getPostbannersCount() > 0) {
            hashCode = (((hashCode * 37) + 3) * 53) + getPostbannersList().hashCode();
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3
    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ExtensionsProto.f97402xce4f2aea.ensureFieldAccessorsInitialized(CreativeExtension.class, Builder.class);
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        byte b = this.memoizedIsInitialized;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.GeneratedMessageV3
    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new CreativeExtension();
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.asset_ != null) {
            codedOutputStream.writeMessage(1, getAsset());
        }
        for (int i = 0; i < this.features_.size(); i++) {
            codedOutputStream.writeMessage(2, this.features_.get(i));
        }
        for (int i2 = 0; i2 < this.postbanners_.size(); i2++) {
            codedOutputStream.writeMessage(3, this.postbanners_.get(i2));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CreativeExtensionOrBuilder {
        private SingleFieldBuilderV3<AssetAppearance, AssetAppearance.Builder, AssetAppearanceOrBuilder> assetBuilder_;
        private AssetAppearance asset_;
        private int bitField0_;
        private RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> featuresBuilder_;
        private List<Feature> features_;
        private RepeatedFieldBuilderV3<Postbanner, Postbanner.Builder, PostbannerOrBuilder> postbannersBuilder_;
        private List<Postbanner> postbanners_;

        private void ensureFeaturesIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.features_ = new ArrayList(this.features_);
                this.bitField0_ |= 1;
            }
        }

        private void ensurePostbannersIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
                this.postbanners_ = new ArrayList(this.postbanners_);
                this.bitField0_ |= 2;
            }
        }

        private SingleFieldBuilderV3<AssetAppearance, AssetAppearance.Builder, AssetAppearanceOrBuilder> getAssetFieldBuilder() {
            if (this.assetBuilder_ == null) {
                this.assetBuilder_ = new SingleFieldBuilderV3<>(getAsset(), getParentForChildren(), isClean());
                this.asset_ = null;
            }
            return this.assetBuilder_;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_CreativeExtension_descriptor;
        }

        private RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> getFeaturesFieldBuilder() {
            if (this.featuresBuilder_ == null) {
                List<Feature> list = this.features_;
                boolean z = true;
                if ((this.bitField0_ & 1) == 0) {
                    z = false;
                }
                this.featuresBuilder_ = new RepeatedFieldBuilderV3<>(list, z, getParentForChildren(), isClean());
                this.features_ = null;
            }
            return this.featuresBuilder_;
        }

        private RepeatedFieldBuilderV3<Postbanner, Postbanner.Builder, PostbannerOrBuilder> getPostbannersFieldBuilder() {
            boolean z;
            if (this.postbannersBuilder_ == null) {
                List<Postbanner> list = this.postbanners_;
                if ((this.bitField0_ & 2) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.postbannersBuilder_ = new RepeatedFieldBuilderV3<>(list, z, getParentForChildren(), isClean());
                this.postbanners_ = null;
            }
            return this.postbannersBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                getFeaturesFieldBuilder();
                getPostbannersFieldBuilder();
            }
        }

        public Builder addAllFeatures(Iterable<? extends Feature> iterable) {
            RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featuresBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureFeaturesIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.features_);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addAllMessages(iterable);
            }
            return this;
        }

        public Builder addAllPostbanners(Iterable<? extends Postbanner> iterable) {
            RepeatedFieldBuilderV3<Postbanner, Postbanner.Builder, PostbannerOrBuilder> repeatedFieldBuilderV3 = this.postbannersBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensurePostbannersIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.postbanners_);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addAllMessages(iterable);
            }
            return this;
        }

        public Builder addFeatures(Feature feature) {
            RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featuresBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                feature.getClass();
                ensureFeaturesIsMutable();
                this.features_.add(feature);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(feature);
            }
            return this;
        }

        public Feature.Builder addFeaturesBuilder() {
            return getFeaturesFieldBuilder().addBuilder(Feature.getDefaultInstance());
        }

        public Builder addPostbanners(Postbanner postbanner) {
            RepeatedFieldBuilderV3<Postbanner, Postbanner.Builder, PostbannerOrBuilder> repeatedFieldBuilderV3 = this.postbannersBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                postbanner.getClass();
                ensurePostbannersIsMutable();
                this.postbanners_.add(postbanner);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(postbanner);
            }
            return this;
        }

        public Postbanner.Builder addPostbannersBuilder() {
            return getPostbannersFieldBuilder().addBuilder(Postbanner.getDefaultInstance());
        }

        public Builder clearAsset() {
            if (this.assetBuilder_ == null) {
                this.asset_ = null;
                onChanged();
            } else {
                this.asset_ = null;
                this.assetBuilder_ = null;
            }
            return this;
        }

        public Builder clearFeatures() {
            RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featuresBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.features_ = Collections.emptyList();
                this.bitField0_ &= -2;
                onChanged();
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        public Builder clearPostbanners() {
            RepeatedFieldBuilderV3<Postbanner, Postbanner.Builder, PostbannerOrBuilder> repeatedFieldBuilderV3 = this.postbannersBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.postbanners_ = Collections.emptyList();
                this.bitField0_ &= -3;
                onChanged();
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        @Override // io.bidmachine.protobuf.CreativeExtensionOrBuilder
        public AssetAppearance getAsset() {
            SingleFieldBuilderV3<AssetAppearance, AssetAppearance.Builder, AssetAppearanceOrBuilder> singleFieldBuilderV3 = this.assetBuilder_;
            if (singleFieldBuilderV3 == null) {
                AssetAppearance assetAppearance = this.asset_;
                if (assetAppearance == null) {
                    return AssetAppearance.getDefaultInstance();
                }
                return assetAppearance;
            }
            return singleFieldBuilderV3.getMessage();
        }

        public AssetAppearance.Builder getAssetBuilder() {
            onChanged();
            return getAssetFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.CreativeExtensionOrBuilder
        public AssetAppearanceOrBuilder getAssetOrBuilder() {
            SingleFieldBuilderV3<AssetAppearance, AssetAppearance.Builder, AssetAppearanceOrBuilder> singleFieldBuilderV3 = this.assetBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessageOrBuilder();
            }
            AssetAppearance assetAppearance = this.asset_;
            if (assetAppearance == null) {
                return AssetAppearance.getDefaultInstance();
            }
            return assetAppearance;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_CreativeExtension_descriptor;
        }

        @Override // io.bidmachine.protobuf.CreativeExtensionOrBuilder
        public Feature getFeatures(int i) {
            RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featuresBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.features_.get(i);
            }
            return repeatedFieldBuilderV3.getMessage(i);
        }

        public Feature.Builder getFeaturesBuilder(int i) {
            return getFeaturesFieldBuilder().getBuilder(i);
        }

        public List<Feature.Builder> getFeaturesBuilderList() {
            return getFeaturesFieldBuilder().getBuilderList();
        }

        @Override // io.bidmachine.protobuf.CreativeExtensionOrBuilder
        public int getFeaturesCount() {
            RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featuresBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.features_.size();
            }
            return repeatedFieldBuilderV3.getCount();
        }

        @Override // io.bidmachine.protobuf.CreativeExtensionOrBuilder
        public List<Feature> getFeaturesList() {
            RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featuresBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return Collections.unmodifiableList(this.features_);
            }
            return repeatedFieldBuilderV3.getMessageList();
        }

        @Override // io.bidmachine.protobuf.CreativeExtensionOrBuilder
        public FeatureOrBuilder getFeaturesOrBuilder(int i) {
            RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featuresBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.features_.get(i);
            }
            return repeatedFieldBuilderV3.getMessageOrBuilder(i);
        }

        @Override // io.bidmachine.protobuf.CreativeExtensionOrBuilder
        public List<? extends FeatureOrBuilder> getFeaturesOrBuilderList() {
            RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featuresBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                return repeatedFieldBuilderV3.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.features_);
        }

        @Override // io.bidmachine.protobuf.CreativeExtensionOrBuilder
        public Postbanner getPostbanners(int i) {
            RepeatedFieldBuilderV3<Postbanner, Postbanner.Builder, PostbannerOrBuilder> repeatedFieldBuilderV3 = this.postbannersBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.postbanners_.get(i);
            }
            return repeatedFieldBuilderV3.getMessage(i);
        }

        public Postbanner.Builder getPostbannersBuilder(int i) {
            return getPostbannersFieldBuilder().getBuilder(i);
        }

        public List<Postbanner.Builder> getPostbannersBuilderList() {
            return getPostbannersFieldBuilder().getBuilderList();
        }

        @Override // io.bidmachine.protobuf.CreativeExtensionOrBuilder
        public int getPostbannersCount() {
            RepeatedFieldBuilderV3<Postbanner, Postbanner.Builder, PostbannerOrBuilder> repeatedFieldBuilderV3 = this.postbannersBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.postbanners_.size();
            }
            return repeatedFieldBuilderV3.getCount();
        }

        @Override // io.bidmachine.protobuf.CreativeExtensionOrBuilder
        public List<Postbanner> getPostbannersList() {
            RepeatedFieldBuilderV3<Postbanner, Postbanner.Builder, PostbannerOrBuilder> repeatedFieldBuilderV3 = this.postbannersBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return Collections.unmodifiableList(this.postbanners_);
            }
            return repeatedFieldBuilderV3.getMessageList();
        }

        @Override // io.bidmachine.protobuf.CreativeExtensionOrBuilder
        public PostbannerOrBuilder getPostbannersOrBuilder(int i) {
            RepeatedFieldBuilderV3<Postbanner, Postbanner.Builder, PostbannerOrBuilder> repeatedFieldBuilderV3 = this.postbannersBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.postbanners_.get(i);
            }
            return repeatedFieldBuilderV3.getMessageOrBuilder(i);
        }

        @Override // io.bidmachine.protobuf.CreativeExtensionOrBuilder
        public List<? extends PostbannerOrBuilder> getPostbannersOrBuilderList() {
            RepeatedFieldBuilderV3<Postbanner, Postbanner.Builder, PostbannerOrBuilder> repeatedFieldBuilderV3 = this.postbannersBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                return repeatedFieldBuilderV3.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.postbanners_);
        }

        @Override // io.bidmachine.protobuf.CreativeExtensionOrBuilder
        public boolean hasAsset() {
            if (this.assetBuilder_ == null && this.asset_ == null) {
                return false;
            }
            return true;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExtensionsProto.f97402xce4f2aea.ensureFieldAccessorsInitialized(CreativeExtension.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeAsset(AssetAppearance assetAppearance) {
            SingleFieldBuilderV3<AssetAppearance, AssetAppearance.Builder, AssetAppearanceOrBuilder> singleFieldBuilderV3 = this.assetBuilder_;
            if (singleFieldBuilderV3 == null) {
                AssetAppearance assetAppearance2 = this.asset_;
                if (assetAppearance2 != null) {
                    this.asset_ = AssetAppearance.newBuilder(assetAppearance2).mergeFrom(assetAppearance).buildPartial();
                } else {
                    this.asset_ = assetAppearance;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(assetAppearance);
            }
            return this;
        }

        public Builder removeFeatures(int i) {
            RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featuresBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureFeaturesIsMutable();
                this.features_.remove(i);
                onChanged();
            } else {
                repeatedFieldBuilderV3.remove(i);
            }
            return this;
        }

        public Builder removePostbanners(int i) {
            RepeatedFieldBuilderV3<Postbanner, Postbanner.Builder, PostbannerOrBuilder> repeatedFieldBuilderV3 = this.postbannersBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensurePostbannersIsMutable();
                this.postbanners_.remove(i);
                onChanged();
            } else {
                repeatedFieldBuilderV3.remove(i);
            }
            return this;
        }

        public Builder setAsset(AssetAppearance assetAppearance) {
            SingleFieldBuilderV3<AssetAppearance, AssetAppearance.Builder, AssetAppearanceOrBuilder> singleFieldBuilderV3 = this.assetBuilder_;
            if (singleFieldBuilderV3 == null) {
                assetAppearance.getClass();
                this.asset_ = assetAppearance;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(assetAppearance);
            }
            return this;
        }

        public Builder setFeatures(int i, Feature feature) {
            RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featuresBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                feature.getClass();
                ensureFeaturesIsMutable();
                this.features_.set(i, feature);
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, feature);
            }
            return this;
        }

        public Builder setPostbanners(int i, Postbanner postbanner) {
            RepeatedFieldBuilderV3<Postbanner, Postbanner.Builder, PostbannerOrBuilder> repeatedFieldBuilderV3 = this.postbannersBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                postbanner.getClass();
                ensurePostbannersIsMutable();
                this.postbanners_.set(i, postbanner);
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, postbanner);
            }
            return this;
        }

        private Builder() {
            this.features_ = Collections.emptyList();
            this.postbanners_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public CreativeExtension build() {
            CreativeExtension buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) buildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public CreativeExtension buildPartial() {
            CreativeExtension creativeExtension = new CreativeExtension(this);
            SingleFieldBuilderV3<AssetAppearance, AssetAppearance.Builder, AssetAppearanceOrBuilder> singleFieldBuilderV3 = this.assetBuilder_;
            if (singleFieldBuilderV3 == null) {
                creativeExtension.asset_ = this.asset_;
            } else {
                creativeExtension.asset_ = singleFieldBuilderV3.build();
            }
            RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featuresBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                creativeExtension.features_ = repeatedFieldBuilderV3.build();
            } else {
                if ((this.bitField0_ & 1) != 0) {
                    this.features_ = Collections.unmodifiableList(this.features_);
                    this.bitField0_ &= -2;
                }
                creativeExtension.features_ = this.features_;
            }
            RepeatedFieldBuilderV3<Postbanner, Postbanner.Builder, PostbannerOrBuilder> repeatedFieldBuilderV32 = this.postbannersBuilder_;
            if (repeatedFieldBuilderV32 != null) {
                creativeExtension.postbanners_ = repeatedFieldBuilderV32.build();
            } else {
                if ((this.bitField0_ & 2) != 0) {
                    this.postbanners_ = Collections.unmodifiableList(this.postbanners_);
                    this.bitField0_ &= -3;
                }
                creativeExtension.postbanners_ = this.postbanners_;
            }
            onBuilt();
            return creativeExtension;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
        public CreativeExtension getDefaultInstanceForType() {
            return CreativeExtension.getDefaultInstance();
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
        public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.setField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
        public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
            return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
        public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.setUnknownFields(unknownFieldSet);
        }

        public Feature.Builder addFeaturesBuilder(int i) {
            return getFeaturesFieldBuilder().addBuilder(i, Feature.getDefaultInstance());
        }

        public Postbanner.Builder addPostbannersBuilder(int i) {
            return getPostbannersFieldBuilder().addBuilder(i, Postbanner.getDefaultInstance());
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            return (Builder) super.clearOneof(oneofDescriptor);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.mergeUnknownFields(unknownFieldSet);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            if (this.assetBuilder_ == null) {
                this.asset_ = null;
            } else {
                this.asset_ = null;
                this.assetBuilder_ = null;
            }
            RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featuresBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.features_ = Collections.emptyList();
                this.bitField0_ &= -2;
            } else {
                repeatedFieldBuilderV3.clear();
            }
            RepeatedFieldBuilderV3<Postbanner, Postbanner.Builder, PostbannerOrBuilder> repeatedFieldBuilderV32 = this.postbannersBuilder_;
            if (repeatedFieldBuilderV32 == null) {
                this.postbanners_ = Collections.emptyList();
                this.bitField0_ &= -3;
            } else {
                repeatedFieldBuilderV32.clear();
            }
            return this;
        }

        public Builder setAsset(AssetAppearance.Builder builder) {
            SingleFieldBuilderV3<AssetAppearance, AssetAppearance.Builder, AssetAppearanceOrBuilder> singleFieldBuilderV3 = this.assetBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.asset_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.features_ = Collections.emptyList();
            this.postbanners_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        public Builder addFeatures(int i, Feature feature) {
            RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featuresBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                feature.getClass();
                ensureFeaturesIsMutable();
                this.features_.add(i, feature);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, feature);
            }
            return this;
        }

        public Builder addPostbanners(int i, Postbanner postbanner) {
            RepeatedFieldBuilderV3<Postbanner, Postbanner.Builder, PostbannerOrBuilder> repeatedFieldBuilderV3 = this.postbannersBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                postbanner.getClass();
                ensurePostbannersIsMutable();
                this.postbanners_.add(i, postbanner);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, postbanner);
            }
            return this;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.AbstractMessageLite.Builder
        /* renamed from: clone */
        public Builder mo110022clone() {
            return (Builder) super.mo110022clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof CreativeExtension) {
                return mergeFrom((CreativeExtension) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder setFeatures(int i, Feature.Builder builder) {
            RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featuresBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureFeaturesIsMutable();
                this.features_.set(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, builder.build());
            }
            return this;
        }

        public Builder setPostbanners(int i, Postbanner.Builder builder) {
            RepeatedFieldBuilderV3<Postbanner, Postbanner.Builder, PostbannerOrBuilder> repeatedFieldBuilderV3 = this.postbannersBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensurePostbannersIsMutable();
                this.postbanners_.set(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, builder.build());
            }
            return this;
        }

        public Builder mergeFrom(CreativeExtension creativeExtension) {
            if (creativeExtension == CreativeExtension.getDefaultInstance()) {
                return this;
            }
            if (creativeExtension.hasAsset()) {
                mergeAsset(creativeExtension.getAsset());
            }
            if (this.featuresBuilder_ == null) {
                if (!creativeExtension.features_.isEmpty()) {
                    if (this.features_.isEmpty()) {
                        this.features_ = creativeExtension.features_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureFeaturesIsMutable();
                        this.features_.addAll(creativeExtension.features_);
                    }
                    onChanged();
                }
            } else if (!creativeExtension.features_.isEmpty()) {
                if (!this.featuresBuilder_.isEmpty()) {
                    this.featuresBuilder_.addAllMessages(creativeExtension.features_);
                } else {
                    this.featuresBuilder_.dispose();
                    this.featuresBuilder_ = null;
                    this.features_ = creativeExtension.features_;
                    this.bitField0_ &= -2;
                    this.featuresBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getFeaturesFieldBuilder() : null;
                }
            }
            if (this.postbannersBuilder_ == null) {
                if (!creativeExtension.postbanners_.isEmpty()) {
                    if (this.postbanners_.isEmpty()) {
                        this.postbanners_ = creativeExtension.postbanners_;
                        this.bitField0_ &= -3;
                    } else {
                        ensurePostbannersIsMutable();
                        this.postbanners_.addAll(creativeExtension.postbanners_);
                    }
                    onChanged();
                }
            } else if (!creativeExtension.postbanners_.isEmpty()) {
                if (!this.postbannersBuilder_.isEmpty()) {
                    this.postbannersBuilder_.addAllMessages(creativeExtension.postbanners_);
                } else {
                    this.postbannersBuilder_.dispose();
                    this.postbannersBuilder_ = null;
                    this.postbanners_ = creativeExtension.postbanners_;
                    this.bitField0_ &= -3;
                    this.postbannersBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getPostbannersFieldBuilder() : null;
                }
            }
            mergeUnknownFields(((GeneratedMessageV3) creativeExtension).unknownFields);
            onChanged();
            return this;
        }

        public Builder addFeatures(Feature.Builder builder) {
            RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featuresBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureFeaturesIsMutable();
                this.features_.add(builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(builder.build());
            }
            return this;
        }

        public Builder addPostbanners(Postbanner.Builder builder) {
            RepeatedFieldBuilderV3<Postbanner, Postbanner.Builder, PostbannerOrBuilder> repeatedFieldBuilderV3 = this.postbannersBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensurePostbannersIsMutable();
                this.postbanners_.add(builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(builder.build());
            }
            return this;
        }

        public Builder addFeatures(int i, Feature.Builder builder) {
            RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featuresBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureFeaturesIsMutable();
                this.features_.add(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, builder.build());
            }
            return this;
        }

        public Builder addPostbanners(int i, Postbanner.Builder builder) {
            RepeatedFieldBuilderV3<Postbanner, Postbanner.Builder, PostbannerOrBuilder> repeatedFieldBuilderV3 = this.postbannersBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensurePostbannersIsMutable();
                this.postbanners_.add(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, builder.build());
            }
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.AbstractMessageLite.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public io.bidmachine.protobuf.CreativeExtension.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.Parser r1 = io.bidmachine.protobuf.CreativeExtension.access$8400()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                io.bidmachine.protobuf.CreativeExtension r3 = (io.bidmachine.protobuf.CreativeExtension) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                if (r3 == 0) goto L10
                r2.mergeFrom(r3)
            L10:
                return r2
            L11:
                r3 = move-exception
                goto L21
            L13:
                r3 = move-exception
                com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> L11
                io.bidmachine.protobuf.CreativeExtension r4 = (io.bidmachine.protobuf.CreativeExtension) r4     // Catch: java.lang.Throwable -> L11
                java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1f
                throw r3     // Catch: java.lang.Throwable -> L1f
            L1f:
                r3 = move-exception
                r0 = r4
            L21:
                if (r0 == 0) goto L26
                r2.mergeFrom(r0)
            L26:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.CreativeExtension.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):io.bidmachine.protobuf.CreativeExtension$Builder");
        }
    }

    public static Builder newBuilder(CreativeExtension creativeExtension) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(creativeExtension);
    }

    public static CreativeExtension parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    private CreativeExtension(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static CreativeExtension parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CreativeExtension) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static CreativeExtension parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
    public CreativeExtension getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static CreativeExtension parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private CreativeExtension() {
        this.memoizedIsInitialized = (byte) -1;
        this.features_ = Collections.emptyList();
        this.postbanners_ = Collections.emptyList();
    }

    public static CreativeExtension parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.GeneratedMessageV3
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static CreativeExtension parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static CreativeExtension parseFrom(InputStream inputStream) throws IOException {
        return (CreativeExtension) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private CreativeExtension(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        this();
        extensionRegistryLite.getClass();
        UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                AssetAppearance assetAppearance = this.asset_;
                                AssetAppearance.Builder builder = assetAppearance != null ? assetAppearance.toBuilder() : null;
                                AssetAppearance assetAppearance2 = (AssetAppearance) codedInputStream.readMessage(AssetAppearance.parser(), extensionRegistryLite);
                                this.asset_ = assetAppearance2;
                                if (builder != null) {
                                    builder.mergeFrom(assetAppearance2);
                                    this.asset_ = builder.buildPartial();
                                }
                            } else if (readTag == 18) {
                                if (!(z2 & true)) {
                                    this.features_ = new ArrayList();
                                    z2 |= true;
                                }
                                this.features_.add(codedInputStream.readMessage(Feature.parser(), extensionRegistryLite));
                            } else if (readTag != 26) {
                                if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                }
                            } else {
                                if (!(z2 & true)) {
                                    this.postbanners_ = new ArrayList();
                                    z2 |= true;
                                }
                                this.postbanners_.add(codedInputStream.readMessage(Postbanner.parser(), extensionRegistryLite));
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    }
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                }
            } finally {
                if (z2 & true) {
                    this.features_ = Collections.unmodifiableList(this.features_);
                }
                if (z2 & true) {
                    this.postbanners_ = Collections.unmodifiableList(this.postbanners_);
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
            }
        }
    }

    public static CreativeExtension parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CreativeExtension) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static CreativeExtension parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CreativeExtension) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static CreativeExtension parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CreativeExtension) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }
}
