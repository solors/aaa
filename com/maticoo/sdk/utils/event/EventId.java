package com.maticoo.sdk.utils.event;

import android.util.SparseArray;

/* loaded from: classes6.dex */
public class EventId {
    public static final int AD_ADAPTER_BID_LOSS = 212;
    public static final String AD_ADAPTER_BID_LOSS_NAME = "m_bid_loss";
    public static final int AD_ADAPTER_BID_WIN = 211;
    public static final String AD_ADAPTER_BID_WIN_NAME = "m_bid_win";
    public static final int AD_ADAPTER_CLICK = 209;
    public static final String AD_ADAPTER_CLICK_NAME = "m_click";
    public static final int AD_ADAPTER_DISPLAY = 202;
    public static final int AD_ADAPTER_DISPLAYED = 207;
    public static final String AD_ADAPTER_DISPLAYED_NAME = "m_imp";
    public static final int AD_ADAPTER_DISPLAY_FAILED = 208;
    public static final String AD_ADAPTER_DISPLAY_FAILED_NAME = "m_show_failed";
    public static final String AD_ADAPTER_DISPLAY_NAME = "m_show";
    public static final int AD_ADAPTER_EXCEPTION = 210;
    public static final String AD_ADAPTER_EXCEPTION_NAME = "m_exception";
    public static final int AD_ADAPTER_LOAD = 201;
    public static final int AD_ADAPTER_LOAD_FAILED = 206;
    public static final String AD_ADAPTER_LOAD_FAILED_NAME = "m_load_failed";
    public static final String AD_ADAPTER_LOAD_NAME = "m_load";
    public static final int AD_ADAPTER_LOAD_SUCCESS = 205;
    public static final String AD_ADAPTER_LOAD_SUCCESS_NAME = "m_load_success";
    public static final int AD_ADAPTER_SDK_INIT_FAILED = 204;
    public static final String AD_ADAPTER_SDK_INIT_FAILED_NAME = "m_init_failed";
    public static final int AD_ADAPTER_SDK_INIT_SUCCESS = 203;
    public static final String AD_ADAPTER_SDK_INIT_SUCCESS_NAME = "m_init";
    public static final int AD_CLICK = 109;
    public static final String AD_CLICK_NAME = "click";
    public static final int AD_CLICK_TRUMPET = 111;
    public static final String AD_CLICK_TRUMPET_NAME = "mute";
    public static final int AD_CLOSE = 110;
    public static final String AD_CLOSE_NAME = "close";
    public static final int AD_EXCEPTION_IMPORTANT_EVENT = 501;
    public static final String AD_EXCEPTION_IMPORTANT_EVENT_NAME = "exception_important";
    public static final int AD_EXCEPTION_NORMAL_EVENT = 502;
    public static final String AD_EXCEPTION_NORMAL_EVENT_NAME = "exception_normal";
    public static final int AD_INTERACT_ENTRANCE_CLICK = 302;
    public static final String AD_INTERACT_ENTRANCE_CLICK_NAME = "i_click";
    public static final int AD_INTERACT_ENTRANCE_SHOW = 301;
    public static final String AD_INTERACT_ENTRANCE_SHOW_NAME = "i_show";
    public static final int AD_INTERACT_H5_EVENT = 303;
    public static final String AD_INTERACT_H5_EVENT_NAME = "i_event";
    public static final int AD_JS_LOG_EVENT = 401;
    public static final String AD_JS_LOG_EVENT_NAME = "js_log";
    public static final int AD_LOAD = 113;
    public static final int AD_LOAD_CACHE_SUCCESS = 121;
    public static final String AD_LOAD_CACHE_SUCCESS_NAME = "cache_success";
    public static final int AD_LOAD_FAILED = 106;
    public static final String AD_LOAD_FAILED_NAME = "load_failed";
    public static final int AD_LOAD_HAS_CACHED = 112;
    public static final String AD_LOAD_HAS_CACHED_NAME = "hitcache";
    public static final String AD_LOAD_NAME = "load";
    public static final int AD_LOAD_REQUEST = 102;
    public static final int AD_LOAD_REQUEST_FAILED = 105;
    public static final String AD_LOAD_REQUEST_FAILED_NAME = "request_failed";
    public static final String AD_LOAD_REQUEST_NAME = "load_request";
    public static final int AD_LOAD_REQUEST_SUCCESS = 120;
    public static final String AD_LOAD_REQUEST_SUCCESS_NAME = "request_success";
    public static final int AD_LOAD_SUCCEED = 103;
    public static final String AD_LOAD_SUCCEED_NAME = "load_success";
    public static final int AD_LOGO_CLICK = 118;
    public static final String AD_LOGO_CLICK_NAME = "click_privacy";
    public static final int AD_SHOW = 119;
    public static final int AD_SHOW_CURRENT_SHOWING = 117;
    public static final String AD_SHOW_CURRENT_SHOWING_NAME = "isshowing";
    public static final int AD_SHOW_FAILED = 107;
    public static final String AD_SHOW_FAILED_NAME = "show_failed";
    public static final int AD_SHOW_LAYOUT = 122;
    public static final String AD_SHOW_LAYOUT_NAME = "layout";
    public static final String AD_SHOW_NAME = "show";
    public static final int AD_SHOW_SUCCESS = 116;
    public static final String AD_SHOW_SUCCESS_NAME = "imp";
    public static final int AD_VIDEO_COMPLETED = 115;
    public static final String AD_VIDEO_COMPLETED_NAME = "video_completed";
    public static final int AD_VIDEO_IMPL = 108;
    public static final String AD_VIDEO_IMPL_NAME = "video_start";
    public static final int AD_VIEW_CHECK = 123;
    public static final String AD_VIEW_CHECK_NAME = "imp_interval";
    public static final int AD_VIEW_COVERED_EVENT = 504;
    public static final String AD_VIEW_COVERED_EVENT_NAME = "ad_view_covered";
    public static final int AD_WEBVIEW_RENDER_GONE_EVENT = 503;
    public static final String AD_WEBVIEW_RENDER_GONE_EVENT_NAME = "webview_render_gone";
    public static final int INIT_COMPLETE = 101;
    public static final String INIT_COMPLETE_NAME = "inited";
    public static final int INIT_FAILED = 104;
    public static final String INIT_FAILED_NAME = "init_failed";
    public static final int INIT_START = 100;
    public static final String INIT_START_NAME = "init";
    public static final int OTHER_CHECK_DNS = 901;
    public static final String OTHER_CHECK_DNS_NAME = "check_net";
    public static final int USER_DURATION = 603;
    public static final String USER_DURATION_NAME = "duration";
    public static final int USER_PORTRAIT = 602;
    public static final String USER_PORTRAIT_NAME = "portrait";
    public static final int USER_SET = 601;
    public static final String USER_SET_NAME = "user_set";
    private static final SparseArray<EventIdData> mEventMap;

    /* loaded from: classes6.dex */
    static class EventIdData {
        int code;
        String name;
        int priority;

        public EventIdData(int i, String str, int i2) {
            this.code = i;
            this.name = str;
            this.priority = i2;
        }
    }

    static {
        SparseArray<EventIdData> sparseArray = new SparseArray<>();
        mEventMap = sparseArray;
        sparseArray.put(100, new EventIdData(100, "init", 0));
        sparseArray.put(101, new EventIdData(101, INIT_COMPLETE_NAME, 2));
        sparseArray.put(104, new EventIdData(104, INIT_FAILED_NAME, 0));
        sparseArray.put(113, new EventIdData(113, "load", 1));
        sparseArray.put(112, new EventIdData(112, AD_LOAD_HAS_CACHED_NAME, 3));
        sparseArray.put(102, new EventIdData(102, AD_LOAD_REQUEST_NAME, 3));
        sparseArray.put(103, new EventIdData(103, AD_LOAD_SUCCEED_NAME, 1));
        sparseArray.put(105, new EventIdData(105, AD_LOAD_REQUEST_FAILED_NAME, 3));
        sparseArray.put(120, new EventIdData(120, AD_LOAD_REQUEST_SUCCESS_NAME, 3));
        sparseArray.put(121, new EventIdData(121, AD_LOAD_CACHE_SUCCESS_NAME, 3));
        sparseArray.put(106, new EventIdData(106, AD_LOAD_FAILED_NAME, 1));
        sparseArray.put(107, new EventIdData(107, AD_SHOW_FAILED_NAME, 1));
        sparseArray.put(116, new EventIdData(116, AD_SHOW_SUCCESS_NAME, 1));
        sparseArray.put(122, new EventIdData(122, "layout", 2));
        sparseArray.put(123, new EventIdData(123, AD_VIEW_CHECK_NAME, 2));
        sparseArray.put(117, new EventIdData(117, AD_SHOW_CURRENT_SHOWING_NAME, 3));
        sparseArray.put(108, new EventIdData(108, AD_VIDEO_IMPL_NAME, 2));
        sparseArray.put(118, new EventIdData(118, AD_LOGO_CLICK_NAME, 3));
        sparseArray.put(115, new EventIdData(115, "video_completed", 2));
        sparseArray.put(109, new EventIdData(109, "click", 1));
        sparseArray.put(110, new EventIdData(110, "close", 2));
        sparseArray.put(111, new EventIdData(111, "mute", 3));
        sparseArray.put(203, new EventIdData(203, AD_ADAPTER_SDK_INIT_SUCCESS_NAME, 2));
        sparseArray.put(204, new EventIdData(204, AD_ADAPTER_SDK_INIT_FAILED_NAME, 2));
        sparseArray.put(201, new EventIdData(201, AD_ADAPTER_LOAD_NAME, 2));
        sparseArray.put(205, new EventIdData(205, AD_ADAPTER_LOAD_SUCCESS_NAME, 2));
        sparseArray.put(206, new EventIdData(206, AD_ADAPTER_LOAD_FAILED_NAME, 2));
        sparseArray.put(202, new EventIdData(202, AD_ADAPTER_DISPLAY_NAME, 2));
        sparseArray.put(207, new EventIdData(207, AD_ADAPTER_DISPLAYED_NAME, 2));
        sparseArray.put(208, new EventIdData(208, AD_ADAPTER_DISPLAY_FAILED_NAME, 2));
        sparseArray.put(209, new EventIdData(209, AD_ADAPTER_CLICK_NAME, 2));
        sparseArray.put(210, new EventIdData(210, AD_ADAPTER_EXCEPTION_NAME, 1));
        sparseArray.put(211, new EventIdData(211, AD_ADAPTER_BID_WIN_NAME, 1));
        sparseArray.put(212, new EventIdData(212, AD_ADAPTER_BID_LOSS_NAME, 1));
        sparseArray.put(301, new EventIdData(301, AD_INTERACT_ENTRANCE_SHOW_NAME, 2));
        sparseArray.put(302, new EventIdData(302, AD_INTERACT_ENTRANCE_CLICK_NAME, 2));
        sparseArray.put(303, new EventIdData(303, AD_INTERACT_H5_EVENT_NAME, 2));
        sparseArray.put(401, new EventIdData(401, "js_log", 0));
        sparseArray.put(901, new EventIdData(901, OTHER_CHECK_DNS_NAME, 3));
        sparseArray.put(119, new EventIdData(119, "show", 1));
        sparseArray.put(601, new EventIdData(601, USER_SET_NAME, 0));
        sparseArray.put(602, new EventIdData(602, "portrait", 0));
        sparseArray.put(603, new EventIdData(603, "duration", 0));
        sparseArray.put(501, new EventIdData(501, AD_EXCEPTION_IMPORTANT_EVENT_NAME, 0));
        sparseArray.put(502, new EventIdData(502, AD_EXCEPTION_NORMAL_EVENT_NAME, 3));
        sparseArray.put(503, new EventIdData(503, AD_WEBVIEW_RENDER_GONE_EVENT_NAME, 0));
        sparseArray.put(504, new EventIdData(504, AD_VIEW_COVERED_EVENT_NAME, 0));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String getEventName(int i) {
        EventIdData eventIdData = mEventMap.get(i);
        if (eventIdData == null) {
            return "" + i;
        }
        return eventIdData.name;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int getEventPriority(int i) {
        EventIdData eventIdData = mEventMap.get(i);
        if (eventIdData == null) {
            return 3;
        }
        return eventIdData.priority;
    }
}
