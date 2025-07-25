package io.bidmachine.protobuf;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.ExtensionRegistry;
import com.explorestack.protobuf.ExtensionRegistryLite;
import com.explorestack.protobuf.GeneratedMessageV3;
import com.explorestack.protobuf.StructProto;
import com.explorestack.protobuf.TimestampProto;
import com.explorestack.protobuf.adcom.AdcomProto;
import com.google.common.net.HttpHeaders;
import com.smaato.sdk.video.vast.model.Linear;
import io.bidmachine.protobuf.rendering.RenderingProto;

/* loaded from: classes9.dex */
public final class ExtensionsProto {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n$bidmachine/protobuf/extensions.proto\u0012\u0013bidmachine.protobuf\u001a%bidmachine/protobuf/adcom/adcom.proto\u001a-bidmachine/protobuf/rendering/rendering.proto\u001a\u001fgoogle/protobuf/timestamp.proto\u001a\u001cgoogle/protobuf/struct.proto\"´\u0002\n\u0010RequestExtension\u0012\u0011\n\tseller_id\u0018\u0001 \u0001(\t\u0012J\n\u000bseller_data\u0018\u0002 \u0003(\u000b25.bidmachine.protobuf.RequestExtension.SellerDataEntry\u0012C\n\u0013header_bidding_type\u0018\u0003 \u0001(\u000e2&.bidmachine.protobuf.HeaderBiddingType\u0012\u000b\n\u0003ifv\u0018\u0004 \u0001(\t\u0012\u000e\n\u0006bm_ifv\u0018\u0005 \u0001(\t\u0012\u0012\n\nsession_id\u0018\u0006 \u0001(\t\u0012\u0018\n\u0010integration_type\u0018\u0007 \u0001(\t\u001a1\n\u000fSellerDataEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\t\u0012\r\n\u0005value\u0018\u0002 \u0001(\t:\u00028\u0001\"\u008b\u000e\n\u000bAdExtension\u0012\u0013\n\u0007preload\u0018\u0002 \u0001(\bB\u0002\u0018\u0001\u0012\u001b\n\u000fload_skipoffset\u0018\u0003 \u0001(\rB\u0002\u0018\u0001\u0012\"\n\u001aviewability_time_threshold\u0018\u0004 \u0001(\r\u0012#\n\u001bviewability_pixel_threshold\u0018\u0005 \u0001(\u0002\u0012&\n\u001eviewability_duration_threshold\u0018\u0006 \u0001(\u0002\u00122\n\u0005event\u0018\u0007 \u0003(\u000b2#.bidmachine.protobuf.adcom.Ad.Event\u0012I\n\rcustom_params\u0018\b \u0003(\u000b22.bidmachine.protobuf.AdExtension.CustomParamsEntry\u0012\u0012\n\nskipoffset\u0018\t \u0001(\r\u0012\u001c\n\u0014companion_skipoffset\u0018\n \u0001(\r\u0012\u0018\n\u0010use_native_close\u0018\u000b \u0001(\b\u0012\n\n\u0002r1\u0018\f \u0001(\b\u0012\n\n\u0002r2\u0018\r \u0001(\b\u0012@\n\tcountdown\u0018\u000e \u0001(\u000b2-.bidmachine.protobuf.AdExtension.ControlAsset\u0012C\n\fclose_button\u0018\u000f \u0001(\u000b2-.bidmachine.protobuf.AdExtension.ControlAsset\u0012&\n\u001eignores_safe_area_layout_guide\u0018\u0010 \u0001(\b\u0012\u0011\n\tstore_url\u0018\u0011 \u0001(\t\u0012?\n\bprogress\u0018\u0012 \u0001(\u000b2-.bidmachine.protobuf.AdExtension.ControlAsset\u0012\u0019\n\u0011progress_duration\u0018\u0013 \u0001(\r\u0012'\n\u001fviewability_ignore_window_focus\u0018\u0014 \u0001(\b\u0012=\n\u0010ad_cache_control\u0018\u0015 \u0001(\u000e2#.bidmachine.protobuf.AdCacheControl\u0012\u0018\n\u0010ad_cache_max_age\u0018\u0016 \u0001(\r\u0012\u0010\n\br1_delay\u0018\u0017 \u0001(\r\u0012!\n\u0019ad_markup_loading_timeout\u0018\u0018 \u0001(\r\u0012\u001c\n\u0014use_embedded_browser\u0018\u0019 \u0001(\b\u0012\u0012\n\npreload_ad\u0018\u001a \u0001(\b\u0012K\n\u0017creative_loading_method\u0018\u001b \u0001(\u000e2*.bidmachine.protobuf.CreativeLoadingMethod\u0012\u001b\n\u0013placeholder_timeout\u0018\u001c \u0001(\u0002\u0012P\n\u0013event_configuration\u0018\u001d \u0001(\u000b23.bidmachine.protobuf.AdExtension.EventConfiguration\u0012\"\n\u001aviewability_ignore_overlap\u0018\u001e \u0001(\b\u0012F\n\u0012creative_extension\u0018\u001f \u0001(\u000b2&.bidmachine.protobuf.CreativeExtensionB\u0002\u0018\u0001\u0012\u0018\n\u0010ad_flexible_size\u0018  \u0001(\b\u0012?\n\u0017rendering_configuration\u0018! \u0001(\u000b2\u001e.bidmachine.protobuf.Rendering\u0012*\n\"mraid_creative_validation_required\u0018\" \u0001(\b\u0012 \n\u0018creative_loading_timeout\u0018# \u0001(\u0005\u001a£\u0002\n\fControlAsset\u0012\u000f\n\u0007content\u0018\u0001 \u0001(\t\u0012\f\n\u0004fill\u0018\u0002 \u0001(\t\u0012\u0012\n\nfont_style\u0018\u0003 \u0001(\r\u0012\u000e\n\u0006height\u0018\u0004 \u0001(\r\u0012\u0011\n\thideafter\u0018\u0005 \u0001(\r\u0012\u000e\n\u0006margin\u0018\u0006 \u0001(\t\u0012\u000f\n\u0007opacity\u0018\u0007 \u0001(\u0002\u0012\u0010\n\boutlined\u0018\b \u0001(\b\u0012\u000f\n\u0007padding\u0018\t \u0001(\t\u0012\u000e\n\u0006shadow\u0018\n \u0001(\t\u0012\u000e\n\u0006stroke\u0018\u000b \u0001(\t\u0012\u0014\n\fstroke_width\u0018\u0012 \u0001(\u0002\u0012\r\n\u0005style\u0018\r \u0001(\t\u0012\u000f\n\u0007visible\u0018\u000e \u0001(\b\u0012\r\n\u0005width\u0018\u000f \u0001(\r\u0012\t\n\u0001x\u0018\u0010 \u0001(\t\u0012\t\n\u0001y\u0018\u0011 \u0001(\t\u001aC\n\u0012EventConfiguration\u0012\u000b\n\u0003url\u0018\u0001 \u0001(\t\u0012\u000f\n\u0007context\u0018\u0002 \u0001(\t\u0012\u000f\n\u0007actions\u0018\u0003 \u0003(\r\u001a3\n\u0011CustomParamsEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\t\u0012\r\n\u0005value\u0018\u0002 \u0001(\t:\u00028\u0001\"T\n\fAppExtension\u00120\n\finstall_time\u0018\u0001 \u0001(\u000b2\u001a.google.protobuf.Timestamp\u0012\u000e\n\u0006uptime\u0018\u0002 \u0001(\u0004:\u0002\u0018\u0001\"6\n\u000fDeviceExtension\u0012\u000f\n\u0007battery\u0018\u0001 \u0001(\r\u0012\u000e\n\u0006rooted\u0018\u0002 \u0001(\b:\u0002\u0018\u0001\"+\n\u0011RegsCcpaExtension\u0012\u0012\n\nus_privacy\u0018\u0001 \u0001(\t:\u0002\u0018\u0001\")\n\u0007Session\u0012\n\n\u0002id\u0018\u0001 \u0001(\t\u0012\u000e\n\u0006uptime\u0018\u0002 \u0001(\u0004:\u0002\u0018\u0001\"Ú\n\n\u0011CreativeExtension\u0012E\n\u0005asset\u0018\u0001 \u0001(\u000b26.bidmachine.protobuf.CreativeExtension.AssetAppearance\u0012@\n\bfeatures\u0018\u0002 \u0003(\u000b2..bidmachine.protobuf.CreativeExtension.Feature\u0012F\n\u000bpostbanners\u0018\u0003 \u0003(\u000b21.bidmachine.protobuf.CreativeExtension.Postbanner\u001a¡\u0002\n\nAssetModel\u0012\u000f\n\u0007content\u0018\u0001 \u0001(\t\u0012\f\n\u0004fill\u0018\u0002 \u0001(\t\u0012\u0012\n\nfont_style\u0018\u0003 \u0001(\r\u0012\u000e\n\u0006height\u0018\u0004 \u0001(\r\u0012\u0011\n\thideafter\u0018\u0005 \u0001(\r\u0012\u000e\n\u0006margin\u0018\u0006 \u0001(\u0002\u0012\u000f\n\u0007opacity\u0018\u0007 \u0001(\u0002\u0012\u0010\n\boutlined\u0018\b \u0001(\b\u0012\u000f\n\u0007padding\u0018\t \u0001(\u0002\u0012\u000e\n\u0006shadow\u0018\n \u0001(\t\u0012\u000e\n\u0006stroke\u0018\u000b \u0001(\t\u0012\u0014\n\fstroke_width\u0018\u0012 \u0001(\u0002\u0012\r\n\u0005style\u0018\r \u0001(\t\u0012\u000f\n\u0007visible\u0018\u000e \u0001(\b\u0012\r\n\u0005width\u0018\u000f \u0001(\r\u0012\t\n\u0001x\u0018\u0010 \u0001(\t\u0012\t\n\u0001y\u0018\u0011 \u0001(\t\u001aË\u0004\n\u000fAssetAppearance\u0012\u0012\n\nclose_time\u0018\u0001 \u0001(\u0002\u0012\u0010\n\bduration\u0018\u0002 \u0001(\r\u0012&\n\u001eignores_safe_area_layout_guide\u0018\u0003 \u0001(\b\u0012\u0018\n\u0010use_custom_close\u0018\u0004 \u0001(\b\u0012\u0012\n\nautorotate\u0018\u0005 \u0001(\b\u0012D\n\tcountdown\u0018\u0006 \u0001(\u000b21.bidmachine.protobuf.CreativeExtension.AssetModel\u0012H\n\rclosable_view\u0018\u0007 \u0001(\u000b21.bidmachine.protobuf.CreativeExtension.AssetModel\u0012C\n\bprogress\u0018\b \u0001(\u000b21.bidmachine.protobuf.CreativeExtension.AssetModel\u0012>\n\u0003cta\u0018\t \u0001(\u000b21.bidmachine.protobuf.CreativeExtension.AssetModel\u0012E\n\nmute_asset\u0018\n \u0001(\u000b21.bidmachine.protobuf.CreativeExtension.AssetModel\u0012F\n\u000bvideo_asset\u0018\u000b \u0001(\u000b21.bidmachine.protobuf.CreativeExtension.AssetModel\u0012\u0018\n\u0010background_color\u0018\f \u0001(\t\u001a&\n\u0007Feature\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\r\n\u0005value\u0018\u0002 \u0001(\t\u001aÙ\u0001\n\nPostbanner\u00120\n\u0003tpe\u0018\u0001 \u0001(\u000e2#.bidmachine.protobuf.PostbannerType\u0012\u0010\n\bsequence\u0018\u0002 \u0001(\r\u0012E\n\u0005asset\u0018\u0003 \u0001(\u000b26.bidmachine.protobuf.CreativeExtension.AssetAppearance\u0012@\n\bfeatures\u0018\u0004 \u0003(\u000b2..bidmachine.protobuf.CreativeExtension.Feature\"\u0086\u0001\n\u0006Extras\u0012(\n\u0007private\u0018\u0001 \u0001(\u000b2\u0017.google.protobuf.Struct\u0012)\n\binternal\u0018\u0002 \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\u0006public\u0018\u0003 \u0001(\u000b2\u0017.google.protobuf.Struct*>\n\u000ePostbannerType\u0012\f\n\bDISABLED\u0010\u0000\u0012\b\n\u0004MAIN\u0010\u0001\u0012\t\n\u0005STORE\u0010\u0002\u0012\t\n\u0005MIXED\u0010\u0003*Ë\u0011\n\u0011EventTypeExtended\u0012\u001f\n\u001bEVENT_TYPE_EXTENDED_INVALID\u0010\u0000\u0012\"\n\u001dEVENT_TYPE_EXTENDED_AD_LOADED\u0010ô\u0003\u0012#\n\u001eEVENT_TYPE_EXTENDED_IMPRESSION\u0010õ\u0003\u0012!\n\u001cEVENT_TYPE_EXTENDED_VIEWABLE\u0010ö\u0003\u0012\u001e\n\u0019EVENT_TYPE_EXTENDED_CLICK\u0010÷\u0003\u0012\u001f\n\u001aEVENT_TYPE_EXTENDED_CLOSED\u0010ø\u0003\u0012%\n EVENT_TYPE_EXTENDED_AD_DESTROYED\u0010ù\u0003\u0012#\n\u001eEVENT_TYPE_EXTENDED_AD_EXPIRED\u0010ÿ\u0003\u0012(\n#EVENT_TYPE_EXTENDED_CONTAINER_ADDED\u0010\u0080\u0004\u0012(\n#EVENT_TYPE_EXTENDED_TOKEN_GENERATED\u0010\u0081\u0004\u0012,\n'EVENT_TYPE_EXTENDED_SESSION_INITIALIZED\u0010ú\u0003\u0012'\n\"EVENT_TYPE_EXTENDED_REQUEST_LOADED\u0010û\u0003\u0012)\n$EVENT_TYPE_EXTENDED_REQUEST_CANCELED\u0010ü\u0003\u0012(\n#EVENT_TYPE_EXTENDED_REQUEST_EXPIRED\u0010ý\u0003\u0012*\n%EVENT_TYPE_EXTENDED_REQUEST_DESTROYED\u0010þ\u0003\u0012\u001e\n\u0019EVENT_TYPE_EXTENDED_START\u0010Ø\u0004\u0012'\n\"EVENT_TYPE_EXTENDED_FIRST_QUARTILE\u0010Ù\u0004\u0012!\n\u001cEVENT_TYPE_EXTENDED_MIDPOINT\u0010Ú\u0004\u0012'\n\"EVENT_TYPE_EXTENDED_THIRD_QUARTILE\u0010Û\u0004\u0012!\n\u001cEVENT_TYPE_EXTENDED_COMPLETE\u0010Ü\u0004\u0012\u001d\n\u0018EVENT_TYPE_EXTENDED_MUTE\u0010Ý\u0004\u0012\u001f\n\u001aEVENT_TYPE_EXTENDED_UNMUTE\u0010Þ\u0004\u0012\u001d\n\u0018EVENT_TYPE_EXTENDED_SKIP\u0010ß\u0004\u0012\u001e\n\u0019EVENT_TYPE_EXTENDED_PAUSE\u0010à\u0004\u0012\u001f\n\u001aEVENT_TYPE_EXTENDED_REWIND\u0010á\u0004\u0012\u001f\n\u001aEVENT_TYPE_EXTENDED_RESUME\u0010â\u0004\u0012#\n\u001eEVENT_TYPE_EXTENDED_FULLSCREEN\u0010ã\u0004\u0012\u001f\n\u001aEVENT_TYPE_EXTENDED_EXPAND\u0010ä\u0004\u0012!\n\u001cEVENT_TYPE_EXTENDED_COLLAPSE\u0010å\u0004\u0012*\n%EVENT_TYPE_EXTENDED_ACCEPT_INVITATION\u0010æ\u0004\u0012\u001e\n\u0019EVENT_TYPE_EXTENDED_CLOSE\u0010ç\u0004\u0012&\n!EVENT_TYPE_EXTENDED_CREATIVE_VIEW\u0010è\u0004\u0012$\n\u001fEVENT_TYPE_EXTENDED_MRAID_CLICK\u0010é\u0004\u0012#\n\u001eEVENT_TYPE_EXTENDED_MRAID_OPEN\u0010ê\u0004\u0012%\n EVENT_TYPE_EXTENDED_MRAID_LOADED\u0010ë\u0004\u0012.\n)EVENT_TYPE_EXTENDED_SK_OVERLAY_PRESENTING\u0010\u0096\u0005\u0012.\n)EVENT_TYPE_EXTENDED_SK_OVERLAY_DISMISSING\u0010\u0097\u0005\u0012/\n*EVENT_TYPE_EXTENDED_HB_NETWORK_INITIALIZED\u0010½\u0005\u0012,\n'EVENT_TYPE_EXTENDED_HB_NETWORK_PREPARED\u0010¾\u0005\u00121\n,EVENT_TYPE_EXTENDED_ALL_HB_NETWORKS_PREPARED\u0010¿\u0005\u0012\u001d\n\u0018EVENT_TYPE_EXTENDED_BURL\u0010¡\u0006\u0012\u001d\n\u0018EVENT_TYPE_EXTENDED_NURL\u0010¢\u0006\u0012\u001d\n\u0018EVENT_TYPE_EXTENDED_LURL\u0010£\u0006\u0012\u001f\n\u001aEVENT_TYPE_EXTENDED_CUSTOM\u0010¤\u0006\u0012$\n\u001fEVENT_TYPE_EXTENDED_CUSTOM_LOSS\u0010¥\u0006\u0012#\n\u001eEVENT_TYPE_EXTENDED_CUSTOM_WIN\u0010¦\u0006\u0012*\n%EVENT_TYPE_EXTENDED_WATERFALL_STARTED\u0010\u0085\u0007\u0012'\n\"EVENT_TYPE_EXTENDED_AD_UNIT_LOADED\u0010\u0086\u0007\u0012)\n$EVENT_TYPE_EXTENDED_AD_UNIT_FINISHED\u0010\u0087\u0007\u0012+\n&EVENT_TYPE_EXTENDED_WATERFALL_FINISHED\u0010\u0088\u0007\u0012(\n#EVENT_TYPE_EXTENDED_AD_UNIT_EXPIRED\u0010\u0089\u0007\u0012,\n'EVENT_TYPE_EXTENDED_AD_UNIT_INVALIDATED\u0010\u008a\u0007\u0012+\n&EVENT_TYPE_EXTENDED_AD_UNIT_IMPRESSION\u0010\u008b\u0007\u0012$\n\u001fEVENT_TYPE_EXTENDED_AD_UNIT_WIN\u0010\u008c\u0007\u0012%\n EVENT_TYPE_EXTENDED_AD_UNIT_LOSS\u0010\u008d\u0007\u0012%\n EVENT_TYPE_EXTENDED_AD_UNIT_PAID\u0010\u008e\u0007\u0012\u001e\n\u0019EVENT_TYPE_EXTENDED_ERROR\u0010è\u0007\u0012'\n\"EVENT_TYPE_EXTENDED_TRACKING_ERROR\u0010é\u0007*ù\u0002\n\nActionType\u0012\u0017\n\u0013ACTION_TYPE_INVALID\u0010\u0000\u0012\u001b\n\u0016ACTION_TYPE_AD_LOADING\u0010ô\u0003\u0012\u0018\n\u0013ACTION_TYPE_SHOWING\u0010õ\u0003\u0012\u0018\n\u0013ACTION_TYPE_VIEWING\u0010ö\u0003\u0012\u0019\n\u0014ACTION_TYPE_CLICKING\u0010÷\u0003\u0012\u0018\n\u0013ACTION_TYPE_CLOSING\u0010ø\u0003\u0012\u001e\n\u0019ACTION_TYPE_AD_DESTROYING\u0010ù\u0003\u0012%\n ACTION_TYPE_SESSION_INITIALIZING\u0010ú\u0003\u0012 \n\u001bACTION_TYPE_REQUEST_LOADING\u0010û\u0003\u0012\"\n\u001dACTION_TYPE_REQUEST_CANCELING\u0010ü\u0003\u0012 \n\u001bACTION_TYPE_HB_INITIALIZING\u0010½\u0005\u0012\u001d\n\u0018ACTION_TYPE_HB_PREPARING\u0010¾\u0005*å\u0003\n\u000bErrorReason\u0012\u0018\n\u0014ERROR_REASON_INVALID\u0010\u0000\u0012\u001e\n\u001aERROR_REASON_NO_CONNECTION\u0010d\u0012\u001c\n\u0018ERROR_REASON_BAD_CONTENT\u0010e\u0012\u0018\n\u0014ERROR_REASON_TIMEOUT\u0010f\u0012\u001b\n\u0017ERROR_REASON_NO_CONTENT\u0010g\u0012\"\n\u001eERROR_REASON_HANDLED_EXCEPTION\u0010h\u0012\u001b\n\u0017ERROR_REASON_WAS_CLOSED\u0010i\u0012\u001e\n\u001aERROR_REASON_WAS_DESTROYED\u0010j\u0012\u001c\n\u0018ERROR_REASON_WAS_EXPIRED\u0010k\u0012!\n\u001dERROR_REASON_WAS_USED_ALREADY\u0010o\u0012\u0019\n\u0015ERROR_REASON_INTERNAL\u0010l\u0012\"\n\u001eERROR_REASON_HTTP_SERVER_ERROR\u0010m\u0012!\n\u001dERROR_REASON_HTTP_BAD_REQUEST\u0010n\u0012\u001c\n\u0017ERROR_REASON_HB_NETWORK\u0010È\u0001\u0012%\n ERROR_REASON_PLACEHOLDER_TIMEOUT\u0010É\u0001*\u0080\u0001\n\u0011HeaderBiddingType\u0012\u001f\n\u001bHEADER_BIDDING_TYPE_INVALID\u0010\u0000\u0012)\n\u001cHEADER_BIDDING_TYPE_DISABLED\u0010ÿÿÿÿÿÿÿÿÿ\u0001\u0012\u001f\n\u001bHEADER_BIDDING_TYPE_ENABLED\u0010\u0001*M\n\u000eAdCacheControl\u0012\u001d\n\u0019AD_CACHE_CONTROL_DISABLED\u0010\u0000\u0012\u001c\n\u0018AD_CACHE_CONTROL_ENABLED\u0010\u0001*B\n\u0015CreativeLoadingMethod\u0012\f\n\bFullLoad\u0010\u0000\u0012\n\n\u0006Stream\u0010\u0001\u0012\u000f\n\u000bPartialLoad\u0010\u0002B1\n\u0016io.bidmachine.protobufB\u000fExtensionsProtoP\u0001¢\u0002\u0003BDMb\u0006proto3"}, new Descriptors.FileDescriptor[]{AdcomProto.getDescriptor(), RenderingProto.getDescriptor(), TimestampProto.getDescriptor(), StructProto.getDescriptor()});

    /* renamed from: internal_static_bidmachine_protobuf_AdExtension_ControlAsset_descriptor */
    static final Descriptors.Descriptor f97386x19fc4d2a;

    /* renamed from: internal_static_bidmachine_protobuf_AdExtension_ControlAsset_fieldAccessorTable */
    static final GeneratedMessageV3.FieldAccessorTable f97387x6a08a9a8;

    /* renamed from: internal_static_bidmachine_protobuf_AdExtension_CustomParamsEntry_descriptor */
    static final Descriptors.Descriptor f97388x1e53ffa4;

    /* renamed from: internal_static_bidmachine_protobuf_AdExtension_CustomParamsEntry_fieldAccessorTable */
    static final GeneratedMessageV3.FieldAccessorTable f97389x652b4222;

    /* renamed from: internal_static_bidmachine_protobuf_AdExtension_EventConfiguration_descriptor */
    static final Descriptors.Descriptor f97390x929a5561;

    /* renamed from: internal_static_bidmachine_protobuf_AdExtension_EventConfiguration_fieldAccessorTable */
    static final GeneratedMessageV3.FieldAccessorTable f97391x62d28adf;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_AdExtension_descriptor;

    /* renamed from: internal_static_bidmachine_protobuf_AdExtension_fieldAccessorTable */
    static final GeneratedMessageV3.FieldAccessorTable f97392x1b41ebde;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_AppExtension_descriptor;

    /* renamed from: internal_static_bidmachine_protobuf_AppExtension_fieldAccessorTable */
    static final GeneratedMessageV3.FieldAccessorTable f97393xf3936840;

    /* renamed from: internal_static_bidmachine_protobuf_CreativeExtension_AssetAppearance_descriptor */
    static final Descriptors.Descriptor f97394xb3b68037;

    /* renamed from: internal_static_bidmachine_protobuf_CreativeExtension_AssetAppearance_fieldAccessorTable */
    static final GeneratedMessageV3.FieldAccessorTable f97395xd3597fb5;

    /* renamed from: internal_static_bidmachine_protobuf_CreativeExtension_AssetModel_descriptor */
    static final Descriptors.Descriptor f97396x78d8fc18;

    /* renamed from: internal_static_bidmachine_protobuf_CreativeExtension_AssetModel_fieldAccessorTable */
    static final GeneratedMessageV3.FieldAccessorTable f97397x87f68a96;

    /* renamed from: internal_static_bidmachine_protobuf_CreativeExtension_Feature_descriptor */
    static final Descriptors.Descriptor f97398x1afb2475;

    /* renamed from: internal_static_bidmachine_protobuf_CreativeExtension_Feature_fieldAccessorTable */
    static final GeneratedMessageV3.FieldAccessorTable f97399x764d05f3;

    /* renamed from: internal_static_bidmachine_protobuf_CreativeExtension_Postbanner_descriptor */
    static final Descriptors.Descriptor f97400xb6405485;

    /* renamed from: internal_static_bidmachine_protobuf_CreativeExtension_Postbanner_fieldAccessorTable */
    static final GeneratedMessageV3.FieldAccessorTable f97401x15a92603;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_CreativeExtension_descriptor;

    /* renamed from: internal_static_bidmachine_protobuf_CreativeExtension_fieldAccessorTable */
    static final GeneratedMessageV3.FieldAccessorTable f97402xce4f2aea;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_DeviceExtension_descriptor;

    /* renamed from: internal_static_bidmachine_protobuf_DeviceExtension_fieldAccessorTable */
    static final GeneratedMessageV3.FieldAccessorTable f97403x1b553c91;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_Extras_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_bidmachine_protobuf_Extras_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_RegsCcpaExtension_descriptor;

    /* renamed from: internal_static_bidmachine_protobuf_RegsCcpaExtension_fieldAccessorTable */
    static final GeneratedMessageV3.FieldAccessorTable f97404x806ff90b;

    /* renamed from: internal_static_bidmachine_protobuf_RequestExtension_SellerDataEntry_descriptor */
    static final Descriptors.Descriptor f97405x1ef2da26;

    /* renamed from: internal_static_bidmachine_protobuf_RequestExtension_SellerDataEntry_fieldAccessorTable */
    static final GeneratedMessageV3.FieldAccessorTable f97406x79107aa4;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_RequestExtension_descriptor;

    /* renamed from: internal_static_bidmachine_protobuf_RequestExtension_fieldAccessorTable */
    static final GeneratedMessageV3.FieldAccessorTable f97407x533b76ae;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_Session_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_bidmachine_protobuf_Session_fieldAccessorTable;

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_bidmachine_protobuf_RequestExtension_descriptor = descriptor2;
        f97407x533b76ae = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"SellerId", "SellerData", "HeaderBiddingType", "Ifv", "BmIfv", "SessionId", "IntegrationType"});
        Descriptors.Descriptor descriptor3 = descriptor2.getNestedTypes().get(0);
        f97405x1ef2da26 = descriptor3;
        f97406x79107aa4 = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"Key", "Value"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(1);
        internal_static_bidmachine_protobuf_AdExtension_descriptor = descriptor4;
        f97392x1b41ebde = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"Preload", "LoadSkipoffset", "ViewabilityTimeThreshold", "ViewabilityPixelThreshold", "ViewabilityDurationThreshold", "Event", "CustomParams", "Skipoffset", "CompanionSkipoffset", "UseNativeClose", "R1", "R2", "Countdown", "CloseButton", "IgnoresSafeAreaLayoutGuide", "StoreUrl", "Progress", "ProgressDuration", "ViewabilityIgnoreWindowFocus", "AdCacheControl", "AdCacheMaxAge", "R1Delay", "AdMarkupLoadingTimeout", "UseEmbeddedBrowser", "PreloadAd", "CreativeLoadingMethod", "PlaceholderTimeout", "EventConfiguration", "ViewabilityIgnoreOverlap", "CreativeExtension", "AdFlexibleSize", "RenderingConfiguration", "MraidCreativeValidationRequired", "CreativeLoadingTimeout"});
        Descriptors.Descriptor descriptor5 = descriptor4.getNestedTypes().get(0);
        f97386x19fc4d2a = descriptor5;
        f97387x6a08a9a8 = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"Content", "Fill", "FontStyle", "Height", "Hideafter", "Margin", "Opacity", "Outlined", "Padding", "Shadow", "Stroke", "StrokeWidth", "Style", "Visible", HttpHeaders.WIDTH, "X", "Y"});
        Descriptors.Descriptor descriptor6 = descriptor4.getNestedTypes().get(1);
        f97390x929a5561 = descriptor6;
        f97391x62d28adf = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"Url", "Context", "Actions"});
        Descriptors.Descriptor descriptor7 = descriptor4.getNestedTypes().get(2);
        f97388x1e53ffa4 = descriptor7;
        f97389x652b4222 = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"Key", "Value"});
        Descriptors.Descriptor descriptor8 = getDescriptor().getMessageTypes().get(2);
        internal_static_bidmachine_protobuf_AppExtension_descriptor = descriptor8;
        f97393xf3936840 = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"InstallTime", "Uptime"});
        Descriptors.Descriptor descriptor9 = getDescriptor().getMessageTypes().get(3);
        internal_static_bidmachine_protobuf_DeviceExtension_descriptor = descriptor9;
        f97403x1b553c91 = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"Battery", "Rooted"});
        Descriptors.Descriptor descriptor10 = getDescriptor().getMessageTypes().get(4);
        internal_static_bidmachine_protobuf_RegsCcpaExtension_descriptor = descriptor10;
        f97404x806ff90b = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"UsPrivacy"});
        Descriptors.Descriptor descriptor11 = getDescriptor().getMessageTypes().get(5);
        internal_static_bidmachine_protobuf_Session_descriptor = descriptor11;
        internal_static_bidmachine_protobuf_Session_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[]{"Id", "Uptime"});
        Descriptors.Descriptor descriptor12 = getDescriptor().getMessageTypes().get(6);
        internal_static_bidmachine_protobuf_CreativeExtension_descriptor = descriptor12;
        f97402xce4f2aea = new GeneratedMessageV3.FieldAccessorTable(descriptor12, new String[]{"Asset", "Features", "Postbanners"});
        Descriptors.Descriptor descriptor13 = descriptor12.getNestedTypes().get(0);
        f97396x78d8fc18 = descriptor13;
        f97397x87f68a96 = new GeneratedMessageV3.FieldAccessorTable(descriptor13, new String[]{"Content", "Fill", "FontStyle", "Height", "Hideafter", "Margin", "Opacity", "Outlined", "Padding", "Shadow", "Stroke", "StrokeWidth", "Style", "Visible", HttpHeaders.WIDTH, "X", "Y"});
        Descriptors.Descriptor descriptor14 = descriptor12.getNestedTypes().get(1);
        f97394xb3b68037 = descriptor14;
        f97395xd3597fb5 = new GeneratedMessageV3.FieldAccessorTable(descriptor14, new String[]{"CloseTime", Linear.DURATION, "IgnoresSafeAreaLayoutGuide", "UseCustomClose", "Autorotate", "Countdown", "ClosableView", "Progress", "Cta", "MuteAsset", "VideoAsset", "BackgroundColor"});
        Descriptors.Descriptor descriptor15 = descriptor12.getNestedTypes().get(2);
        f97398x1afb2475 = descriptor15;
        f97399x764d05f3 = new GeneratedMessageV3.FieldAccessorTable(descriptor15, new String[]{"Name", "Value"});
        Descriptors.Descriptor descriptor16 = descriptor12.getNestedTypes().get(3);
        f97400xb6405485 = descriptor16;
        f97401x15a92603 = new GeneratedMessageV3.FieldAccessorTable(descriptor16, new String[]{"Tpe", "Sequence", "Asset", "Features"});
        Descriptors.Descriptor descriptor17 = getDescriptor().getMessageTypes().get(7);
        internal_static_bidmachine_protobuf_Extras_descriptor = descriptor17;
        internal_static_bidmachine_protobuf_Extras_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor17, new String[]{"Private", "Internal", "Public"});
        AdcomProto.getDescriptor();
        RenderingProto.getDescriptor();
        TimestampProto.getDescriptor();
        StructProto.getDescriptor();
    }

    private ExtensionsProto() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
