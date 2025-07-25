package com.bytedance.sdk.component.ldr.p261bg.p266bX;

import android.text.TextUtils;
import com.bytedance.sdk.component.ldr.p261bg.C7659Kg;
import com.bytedance.sdk.component.ldr.p261bg.InterfaceC7724zx;
import com.bytedance.sdk.component.ldr.p261bg.eqN.InterfaceC7706bg;
import com.bytedance.sdk.component.ldr.p261bg.eqN.p272bg.C7708bg;
import com.bytedance.sdk.component.ldr.p261bg.p262IL.C7655eqN;
import com.bytedance.sdk.component.ldr.p261bg.p262IL.p265bg.C7654bg;
import com.maticoo.sdk.utils.event.Event;
import com.maticoo.sdk.utils.event.EventId;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.ldr.bg.bX.bg */
/* loaded from: classes3.dex */
public class C7662bg {

    /* renamed from: bg */
    private static final LinkedList<String> f16770bg = new LinkedList<>();

    /* renamed from: IL */
    private static final LinkedList<String> f16766IL = new LinkedList<>();

    /* renamed from: bX */
    private static final LinkedList<String> f16769bX = new LinkedList<>();
    private static final LinkedList<String> eqN = new LinkedList<>();

    /* renamed from: zx */
    private static final Map<String, Integer> f16772zx = new HashMap();
    private static HashMap<String, Integer> ldr = null;

    /* renamed from: iR */
    private static String f16771iR = "upload_init";

    /* renamed from: Kg */
    private static int f16767Kg = 0;

    /* renamed from: WR */
    private static int f16768WR = 0;

    /* renamed from: IL */
    private static synchronized String m88145IL(String str) {
        String sb2;
        synchronized (C7662bg.class) {
            LinkedList<String> linkedList = f16766IL;
            if (linkedList.size() >= 10) {
                linkedList.removeFirst();
                linkedList.add(str);
            } else {
                linkedList.add(str);
            }
            StringBuilder sb3 = new StringBuilder();
            Iterator<String> it = linkedList.iterator();
            while (it.hasNext()) {
                sb3.append(it.next());
                sb3.append(",");
            }
            sb2 = sb3.toString();
        }
        return sb2;
    }

    /* renamed from: Kg */
    public static long m88144Kg(InterfaceC7706bg interfaceC7706bg) {
        if (interfaceC7706bg == null || interfaceC7706bg.mo87978iR() == null || !m88147IL()) {
            return 0L;
        }
        try {
            return new JSONObject(interfaceC7706bg.mo87978iR().optString("ad_extra_data")).optLong("sdk_event_index");
        } catch (Exception e) {
            e.getMessage();
            return 0L;
        }
    }

    /* renamed from: VB */
    private static String m88143VB(InterfaceC7706bg interfaceC7706bg) {
        String optString;
        if (interfaceC7706bg == null || interfaceC7706bg.mo87978iR() == null || !m88147IL()) {
            return null;
        }
        JSONObject mo87978iR = interfaceC7706bg.mo87978iR();
        if (interfaceC7706bg.eqN() == 1) {
            optString = mo87978iR.optString("event_extra");
        } else {
            optString = mo87978iR.optString("ad_extra_data");
        }
        try {
            return new JSONObject(optString).optString("sdk_session_id");
        } catch (JSONException e) {
            e.getMessage();
            return null;
        }
    }

    /* renamed from: WR */
    public static long m88142WR(InterfaceC7706bg interfaceC7706bg) {
        if (interfaceC7706bg == null || interfaceC7706bg.mo87978iR() == null || !m88147IL()) {
            return 0L;
        }
        try {
            return new JSONObject(interfaceC7706bg.mo87978iR().optString("ad_extra_data")).optLong("sdk_event_valid_index");
        } catch (Exception e) {
            e.getMessage();
            return 0L;
        }
    }

    /* renamed from: bX */
    private static synchronized String m88139bX(String str) {
        String sb2;
        synchronized (C7662bg.class) {
            LinkedList<String> linkedList = f16769bX;
            if (linkedList.size() >= 10) {
                linkedList.removeFirst();
                linkedList.add(str);
            } else {
                linkedList.add(str);
            }
            StringBuilder sb3 = new StringBuilder();
            Iterator<String> it = linkedList.iterator();
            while (it.hasNext()) {
                sb3.append(it.next());
                sb3.append(",");
            }
            sb2 = sb3.toString();
        }
        return sb2;
    }

    /* renamed from: bg */
    public static String m88137bg(int i) {
        switch (i) {
            case 1:
                return "flush once";
            case 2:
                return "flush memory db";
            case 3:
                return "flush memory";
            case 4:
                return "new event";
            case 5:
                return "server busy";
            case 6:
                return "empty message";
            case 7:
                return "net error";
            default:
                return "default";
        }
    }

    /* renamed from: eo */
    public static void m88127eo(InterfaceC7706bg interfaceC7706bg) {
        try {
            if (!m88147IL()) {
                return;
            }
            InterfaceC7724zx m88153vb = C7659Kg.m88154iR().m88153vb();
            if (!TextUtils.isEmpty(interfaceC7706bg.mo87989bX())) {
                C7661IL.m88148bg(C7655eqN.eqN.m88222GZ(), 1);
            }
            if (m88153vb != null && m88153vb.mo83370IL()) {
                if (interfaceC7706bg.eqN() == 1) {
                    m88146IL(interfaceC7706bg);
                    m88140bX(interfaceC7706bg);
                    interfaceC7706bg.mo87989bX();
                    m88143VB(interfaceC7706bg);
                } else if (interfaceC7706bg.eqN() == 0) {
                    if (interfaceC7706bg.mo87997IL() == 3) {
                        if (interfaceC7706bg.mo87978iR() != null) {
                            interfaceC7706bg.mo87978iR().optString("event");
                            int i = (m88144Kg(interfaceC7706bg) > 0L ? 1 : (m88144Kg(interfaceC7706bg) == 0L ? 0 : -1));
                            int i2 = (m88142WR(interfaceC7706bg) > 0L ? 1 : (m88142WR(interfaceC7706bg) == 0L ? 0 : -1));
                            interfaceC7706bg.mo87989bX();
                            m88143VB(interfaceC7706bg);
                            return;
                        }
                        return;
                    }
                    if (m88142WR(interfaceC7706bg) != 0) {
                        m88135bg(interfaceC7706bg);
                    } else {
                        m88135bg(interfaceC7706bg);
                    }
                    int i3 = (m88144Kg(interfaceC7706bg) > 0L ? 1 : (m88144Kg(interfaceC7706bg) == 0L ? 0 : -1));
                    interfaceC7706bg.mo87989bX();
                    m88143VB(interfaceC7706bg);
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private static synchronized void eqN(String str) {
        synchronized (C7662bg.class) {
            LinkedList<String> linkedList = eqN;
            if (linkedList.size() >= 10) {
                linkedList.removeFirst();
                linkedList.add(str);
                return;
            }
            linkedList.add(str);
        }
    }

    /* renamed from: iR */
    public static void m88126iR(InterfaceC7706bg interfaceC7706bg) {
        try {
            if (C7659Kg.m88154iR().m88153vb().mo83353iR()) {
                C7655eqN.eqN.m88201bg(System.currentTimeMillis() - interfaceC7706bg.mo87993Kg());
                interfaceC7706bg.mo87995IL(System.currentTimeMillis());
                if (interfaceC7706bg.eqN() == 0 && C7659Kg.m88154iR().m88153vb() != null && C7659Kg.m88154iR().m88153vb().mo83360bg()) {
                    String m88135bg = m88135bg(interfaceC7706bg);
                    if (!m88133bg(m88135bg)) {
                        JSONObject mo87978iR = interfaceC7706bg.mo87978iR();
                        String optString = interfaceC7706bg.mo87978iR().optString("ad_extra_data");
                        if (!TextUtils.isEmpty(optString)) {
                            JSONObject jSONObject = new JSONObject(optString);
                            if (TextUtils.isEmpty(jSONObject.optString("save_success_labels"))) {
                                jSONObject.put("save_success_labels", m88145IL(m88135bg + "_" + m88142WR(interfaceC7706bg)));
                            }
                            mo87978iR.put("ad_extra_data", jSONObject.toString());
                            return;
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("save_success_labels", m88145IL(m88135bg + "_" + m88142WR(interfaceC7706bg)));
                        mo87978iR.put("ad_extra_data", jSONObject2.toString());
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    private static synchronized String ldr() {
        String sb2;
        synchronized (C7662bg.class) {
            StringBuilder sb3 = new StringBuilder();
            Iterator<String> it = eqN.iterator();
            while (it.hasNext()) {
                sb3.append(it.next());
                sb3.append(",");
            }
            sb2 = sb3.toString();
        }
        return sb2;
    }

    /* renamed from: zx */
    public static String m88124zx(InterfaceC7706bg interfaceC7706bg) {
        if (interfaceC7706bg == null || interfaceC7706bg.mo87978iR() == null || m88141bX()) {
            return null;
        }
        String optString = interfaceC7706bg.mo87978iR().optString("log_extra");
        if (!TextUtils.isEmpty(optString)) {
            try {
                return new JSONObject(optString).optString("req_id");
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* renamed from: bg */
    public static void m88138bg() {
        if (ldr != null) {
            return;
        }
        String[] strArr = {"first_view", "open_splash", "ad_landing_webview_init", "show_failed_topview", "adstyle_template_show", "splash_init_monitor_first", "download_video_succeed", "shake_skip", "receive", "video_over_auto", Reporting.Key.RENDER_TIME, "splash_ad", "preload_start", "mute", "covered", "download_image_failed", "splash_init_monitor_all", "preload_success_time", "download_video_start_sdk", "download_video_count", "not_showing_reason", "download_image_succeed", "load_video_success", "launch_covered", "download_video_prepare", "download_video_start", "boarding", "ad_wap_stat", "splash_pick", "preload_fail", "should_show", "adstyle_template_fill", "unmute", "preload_success", EventId.AD_SHOW_FAILED_NAME, "stop_showing_monitor", "download_video_no_download", "track_url", "download_creative_duration", "adstyle_template_render", "download_video_count_splash_sdk", "landing_preload_finish", "adstyle_template_load", "load_ad_duration", "client_false_show", "client_false", "download_video_failed", "data_invalid", "topview_boarding", "topview_start_download", "topview_show_confirmed", "splash_start_download", "topview_show_rejected", "splash_no_download", "redownload_video_count", "topview_other_show", "topview_no_download", "ad_selected", "invalid_model", "topview_deliver", "ad_no_selected", "topview_ad_download_retry_label", "request", "response", "parse_finished", "front_performance", "ad_resp", "ad_resp_nodata", "preload_finish", "transit_show", "splash_switch", "block_splash_F2", "render_picture_time", "network_type", "play_start_error", "load_video_error", "render_picture_timeout", "py_loading_success", "download_status", "first_screen_load_finish", "landing_preload_failed", "data_received", "preload_result", "show_result", "reponse", "valid_time", "brand_satefy_context", "topview_ad_link_fail_label", "end_feed_request", "start_feed_request", "set_feed_data", "delayinstall_conflict_with_back_dialog", "clean_fetch_apk_head_failed", "cleanspace_download_after_quite_clean", "fps_too_low", "open_policy", "landing_perf_stats", "preload_topview", "show_effect_start", "dislike_monitor", "hour_show", "hour_skip", "triggered", "click_sound_switch", "enter_loft", "download_resume", "install_view_result", "contiguous_ad_event", "contiguous_ad_remove_event", "report_monitor", "open_landing_blank", "dynamic_ad", "report_load_failed", "ad_download_failed", "download_video_start_first_sdk", "splash_receive", "video_play", "clean_fetch_apk_head_switch_close", "label_external_permission", "pause_reserve_wifi_switch_status", "landing_download_dialog_show", "download_connect", "download_uncompleted", "pause_reserve_wifi_dialog_show", "download_io", "pause_reserve_wifi_confirm", "skvc_load_time", "segment_io", "click_no", "pause_reserve_wifi_cancel_on_wifi", "udp_stop", "mma_url", "error_save_sp", "download_notification_try_show", "ttd_pref_monitor", "item_above_the_fold_stay_time", "ttdownloader_unity", "bdad_query_log", "bdad_load_finish", "bdad_load", "bdad_load_fail", "undefined", "valid_stock", "show_filter", "splash_pk_result", "endcard_page_info", "page_on_create", "statistics_feed_docker", "show_search_card_word", "ad_new_video_render_start_label", "ad_new_video_play_start_label", "ad_new_video_ad_patch_data_set_null_label", "ad_new_video_ad_patch_play_label", "ad_new_video_ad_patch_render_label", "debug_touch_start", "try_second_request", "egg_unzip_success", "tap_2", "anti_0_result", "anti_2_result", "egg_unzip_no_start", "preload_no_start", "bind_impression_212202", "guide_auth_dialog_cancel", "show_im_entry", "sub_reco_impression_v2", "sync_request_log_mask", "no_send_sync_request", "load_timeout", "send_sync_request", "sync_request_not_show", "show_subv_tt_video_food", Event.DEFAULT_TYPE, "custom_event", "rd_landing_page_stat", "update_local_data", "showlimit", "upload_result", "debug_othershow", "debug_otherclick", "ad_show_time", "push_launch", "union_send_duplicate", "mnpl_js_finish_load", "mnpl_resource_finish_load", "mnpl_material_render_timeout", "mnpl_render_timing", "mnpl_vedio_interactive_timegap", "click_non_rectify_area", "start_impression", "end_impression", "picture_render_time", "splash_stop_show", "skip_post", "skan_show_start", "skan_show_end", "load_video_start", "rifle_ad_monitor", "download_video_redownload", "splash_video_quality", "splash_video_end", "splash_video_pause", "splash_video_failed", "adtrace_start_clear", "adtrace_clear_past_data", "adtrace_end_clear", "adtrace_write_success", "adtrace_write_failed", "adtrace_read_result", "adtrace_read_success", "adtrace_read_failed", "pick_model", "cache_model", "adtrace_reparse_file", "deeplink_failed_all", "ad_live_degenerate", "ad_live_miss", "live_play_fail", "sko_show_success", "sko_show_fail", "commerce_apps_open", "commerce_apps_jump", "pic_card_show", "live_ad_card_render_finish", "adtrace_select", "received_card_status", "live_ad_page_load_success", "mp_download_result", "download_video_cancel", "jump_count", "adtrace_try_show", "show_cart_entrance", "live_ad_page_load_fail", "click_interacted", "pop_up", "pop_up_cancel", "stream_loadtime", "mnpl_guide_comp_render", "thirdquartile", "customer_feed_pause", "customer_play_start", "customer_feed_break", "click_area_log", "customer_feed_continue", "customer_feed_play", "mnpl_resource_start_preload", "mnpl_resource_finish_preload", "customer_feed_over", "get_preload_ad", "web_inspect_status", "web_report_status", "preload_begin", "preload_end", "open_begin", "open_end", "pangle_live_sdk_monitor", "success", "rifle_load_state", "rifle_uri_load_state", "component_init", "component_release", "ad_lynx_download_sendAdLog", "dynamic2_render", "lynx_card_show", "pop_up_download", "live_shelf_commodity_show", "unity_fe_click", "enter_ads_explain", "adx_ads_switch", "personal_ads_switch", "qc_product_picture_cancel", "qc_product_picture_save", "qc_product_picture_press", "qc_product_detail_show", "qc_price_instruction_click", "qc_edit_sku_num_click", "service_description_page_duration", "enter_business_qualification_page ", "service_description_page_show", "order_words_fe", "qc_payment_mode_show", "qc_click_ali_pay", "qc_district_addr_click", "qc_auto_information_add", "qc_dial_consult_cancel_btn_click", "qc_dial_consult_show", "qc_maomadeng_click", "qc_maomadeng_show", "slide_product_big_picture", "qc_service_description_close", "appstore_manager_request", "preload_video_result", "preload_video_start", "adtrace_bind", "topview_ad_link_match_event", "skip_leisure_interact_render", "click_start_download", "ad_lynx_landing_page_exception", "lynx_page_res_download_monitor_event", "live_fail", "live_over", "render_live_picture_success", "render_live_picture_fail", "live_play_success", "live_play_close", "item_play_pver", "ad_gap_info", "item_play_over", "has_period_first_chance", "enter_live_auto", "mnpl_material_video_scene_show", "ad_rerank", "in_web_click", "post_request_failed", "destroy", "bidding_load", "bidding_receive", "in_web_scroll", "tobsdk_livesdk_live_show", "xigua_ad_rerank", "applink_unity", "top_ad_show", "top_button_show", "skip_button_show", "skip_click", "shake_show", "skip_result", "show_personal_compliance_button_click", "personal_compliance_click", "ad_click_result", "ad_preload_video", "popup_show", "topview_feed_down", "qr_scan", "qr_show", "topview_popup_show", "topview_feed_over", "topview_feed_show", "feed_down", "engine_ad_send", "permission_click", "policy_click", "download_start_click", "mini_playable_style_report", "load_detect", "aweme_show_info", "click_convert_anchor_detail_page", "click_anchor_gift_button", "show_anchor_gift_page", "click_anchor_gift_card", "show_anchor_gift_card", "anchor_convert_button", "show_anchor_page", "search_result_click", "sdk_session_launch", "not_use_app_link_sdk", "click_ios_check", "auto_open", "bind_click_area", "page_load", "show_finish", "next_fresh", "play_ready", "splash_pk_time", "unshow", "feed_show_failed", "othershow_cancel", "lu_cache", "realtime_splash_result", "channel_override_result", "internal_jump_live_status", "mnpl_video_play_backward", "splash_enter_foreground", "splash_enter_background", "button_light", "long_press", "webview_material_missing_key_error", "live_life_project_click_card", "mnpl_click_event", "show_anchor_convert_button", "bdar_log_info", "bdar_ad_request", "bdar_lynx_template_load_time", "bdar_lynx_fallback", "bdar_fetch_template_data", "bdar_lynx_render_time", "bdar_video_play_effective", "bdar_video_first_frame", "bdar_lynx_jsb_error", "invalidate_back_url_monitor_event", "lynx_page_plugin_exception_event", "live_custom_interaction", "pinch", "if_splash_card", "splash_card_show", "card_show_fail", "splash_card_click", "splash_card_close", "wind_icon_click", "excluded", "show_error", "toutiao_ad_receive", "show_ad", "toutiao_ad_excluded", "close_card", "lynx_status", "qpon_join", "apk_download_user", "comment_key_word_show", "v3_show_ad", "show_wish_button", "enterSection", "single_comment_show", "enter_product_detail", "xigua_ad_request", "qpon_apply", "splash_total_duration", "splash_render_duration", "download_template_duration", "homepage_hot", "homepage_follow", "homepage_fresh", "video_play_success", "general_search", "video_render_cost", "single_ad_render_cost", "unexpected_accurate_pause", "mnpl_interact_skip", "web_report_request_url", "web_report_init_status", "first_request", "video_ended", "mnpl_script_error", "open_wechat_failed_shake", "open_wechat_shacke", "open_wechat_success_shake", "options_popup", "close_pers_ads_type", "check_closed_type", "ad_guide_panel", "learn_ads", "learn_adx_ads", "learn_pers_ads", "resume_closed_type", "twist", "open_wechat_shake"};
        ldr = new HashMap<>(446);
        for (int i = 0; i < 446; i++) {
            ldr.put(strArr[i], 1);
        }
    }

    public static void ldr(InterfaceC7706bg interfaceC7706bg) {
        try {
            if (interfaceC7706bg.eqN() == 0 && C7659Kg.m88154iR().m88153vb() != null && C7659Kg.m88154iR().m88153vb().mo83360bg()) {
                JSONObject mo87978iR = interfaceC7706bg.mo87978iR();
                String m88135bg = m88135bg(interfaceC7706bg);
                if (m88133bg(m88135bg)) {
                    return;
                }
                m88124zx(interfaceC7706bg);
                String optString = mo87978iR.optString("ad_extra_data");
                if (!TextUtils.isEmpty(optString)) {
                    JSONObject jSONObject = new JSONObject(optString);
                    if (TextUtils.isEmpty(jSONObject.optString("will_send_labels"))) {
                        jSONObject.put("will_send_labels", m88139bX(m88135bg + "_" + m88142WR(interfaceC7706bg)));
                        jSONObject.put("send_success_valid_labels", ldr());
                    }
                    mo87978iR.put("ad_extra_data", jSONObject.toString());
                    return;
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("will_send_labels", m88139bX(m88135bg + "_" + m88142WR(interfaceC7706bg)));
                jSONObject2.put("send_success_valid_labels", ldr());
                mo87978iR.put("ad_extra_data", jSONObject2.toString());
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    /* renamed from: bg */
    public static String m88135bg(InterfaceC7706bg interfaceC7706bg) {
        if (interfaceC7706bg == null || interfaceC7706bg.mo87978iR() == null || m88141bX()) {
            return null;
        }
        if (interfaceC7706bg.mo87997IL() == 3) {
            return interfaceC7706bg.mo87978iR().optString("event");
        }
        return interfaceC7706bg.mo87978iR().optString("label");
    }

    public static synchronized int eqN(InterfaceC7706bg interfaceC7706bg) {
        synchronized (C7662bg.class) {
            if (interfaceC7706bg != null) {
                if (interfaceC7706bg.mo87978iR() != null) {
                    if (m88147IL()) {
                        try {
                            return new JSONObject(interfaceC7706bg.mo87978iR().optString("ad_extra_data")).optInt("sdk_event_self_count");
                        } catch (Exception unused) {
                            return 0;
                        }
                    }
                    return 0;
                }
            }
            return 0;
        }
    }

    /* renamed from: zx */
    public static boolean m88125zx() {
        return m88147IL() || eqN();
    }

    /* renamed from: IL */
    public static String m88146IL(InterfaceC7706bg interfaceC7706bg) {
        if (interfaceC7706bg == null || interfaceC7706bg.mo87978iR() == null || m88141bX()) {
            return null;
        }
        return interfaceC7706bg.mo87978iR().optString("type");
    }

    /* renamed from: bX */
    public static int m88140bX(InterfaceC7706bg interfaceC7706bg) {
        if (interfaceC7706bg == null || interfaceC7706bg.mo87978iR() == null || !m88147IL()) {
            return -1;
        }
        try {
            return new JSONObject(interfaceC7706bg.mo87978iR().optString("event_extra")).optInt("stats_index");
        } catch (JSONException unused) {
            return -1;
        }
    }

    /* renamed from: bg */
    public static boolean m88133bg(String str) {
        HashMap<String, Integer> hashMap = ldr;
        if (hashMap == null || str == null) {
            return false;
        }
        return hashMap.containsKey(str);
    }

    /* renamed from: IL */
    public static boolean m88147IL() {
        InterfaceC7724zx m88153vb = C7659Kg.m88154iR().m88153vb();
        return m88153vb != null && m88153vb.ldr() == 0;
    }

    /* renamed from: bg */
    public static void m88132bg(List<InterfaceC7706bg> list, int i) {
        try {
            if (C7659Kg.m88154iR().m88153vb().mo83353iR()) {
                for (InterfaceC7706bg interfaceC7706bg : list) {
                    if (interfaceC7706bg != null && interfaceC7706bg.mo87990WR() != 0) {
                        long currentTimeMillis = System.currentTimeMillis() - interfaceC7706bg.mo87990WR();
                        C7654bg c7654bg = C7655eqN.eqN;
                        c7654bg.m88213RJ().incrementAndGet();
                        c7654bg.m88196lM().getAndAdd(currentTimeMillis);
                        interfaceC7706bg.mo87987bX(System.currentTimeMillis());
                    }
                    if (interfaceC7706bg != null) {
                        ldr(interfaceC7706bg);
                    }
                }
                C7655eqN.eqN.sVc().getAndAdd(list.size());
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: bX */
    public static boolean m88141bX() {
        InterfaceC7724zx m88153vb = C7659Kg.m88154iR().m88153vb();
        return m88153vb != null && m88153vb.ldr() == 2;
    }

    public static boolean eqN() {
        InterfaceC7724zx m88153vb = C7659Kg.m88154iR().m88153vb();
        return m88153vb != null && m88153vb.ldr() == 1;
    }

    /* renamed from: bg */
    public static void m88129bg(JSONObject jSONObject, C7708bg c7708bg) {
        InterfaceC7724zx m88153vb = C7659Kg.m88154iR().m88153vb();
        if (m88153vb != null && m88153vb.mo83370IL() && m88125zx()) {
            jSONObject.optString("label");
            c7708bg.mo87977zx();
        }
    }

    /* renamed from: bg */
    public static void m88131bg(List<InterfaceC7706bg> list, int i, String str) {
        InterfaceC7724zx m88153vb = C7659Kg.m88154iR().m88153vb();
        if (m88153vb == null || !m88153vb.mo83370IL() || list == null || m88141bX()) {
            return;
        }
        boolean z = false;
        for (InterfaceC7706bg interfaceC7706bg : list) {
            if (interfaceC7706bg.eqN() == 0) {
                JSONObject mo87978iR = interfaceC7706bg.mo87978iR();
                m88135bg(interfaceC7706bg);
                if (interfaceC7706bg.mo87997IL() != 3) {
                    m88144Kg(interfaceC7706bg);
                    m88142WR(interfaceC7706bg);
                    eqN(interfaceC7706bg);
                } else if (mo87978iR != null) {
                    mo87978iR.optString("event");
                }
                z = true;
            } else if (interfaceC7706bg.eqN() == 1) {
                m88146IL(interfaceC7706bg);
                m88140bX(interfaceC7706bg);
            }
        }
        if (z) {
            m88137bg(i);
            list.size();
            return;
        }
        m88137bg(i);
        list.size();
    }

    /* renamed from: bg */
    private static void m88134bg(InterfaceC7706bg interfaceC7706bg, String str, InterfaceC7724zx interfaceC7724zx) {
        String m88135bg = m88135bg(interfaceC7706bg);
        if (m88133bg(m88135bg)) {
            return;
        }
        String m88124zx = m88124zx(interfaceC7706bg);
        if (interfaceC7706bg.eqN() == 0 && interfaceC7724zx.mo83360bg()) {
            eqN(m88135bg + "_" + m88142WR(interfaceC7706bg) + "_" + m88124zx + "_" + str);
        }
    }

    /* renamed from: bg */
    public static void m88128bg(boolean z, int i, InterfaceC7706bg interfaceC7706bg) {
        InterfaceC7724zx m88153vb = C7659Kg.m88154iR().m88153vb();
        if (m88141bX() || m88153vb == null || !m88153vb.mo83370IL()) {
            return;
        }
        m88137bg(i);
        TextUtils.isEmpty(m88146IL(interfaceC7706bg));
        TextUtils.isEmpty(m88135bg(interfaceC7706bg));
    }

    /* renamed from: bg */
    public static void m88136bg(int i, List<InterfaceC7706bg> list, long j) {
        if (C7659Kg.m88154iR().m88153vb().mo83353iR()) {
            long currentTimeMillis = System.currentTimeMillis() - j;
            if (i == 200) {
                C7654bg c7654bg = C7655eqN.eqN;
                c7654bg.RiO().getAndAdd(currentTimeMillis);
                c7654bg.m88205Ys().incrementAndGet();
                c7654bg.m88191wS().getAndAdd(list.size());
                c7654bg.m88195qC().getAndAdd(list.size());
                return;
            }
            if (i == -1) {
                C7655eqN.eqN.cZH().getAndAdd(list.size());
            } else {
                C7655eqN.eqN.Pae().getAndAdd(list.size());
            }
            C7654bg c7654bg2 = C7655eqN.eqN;
            c7654bg2.m88224Dt().getAndAdd(currentTimeMillis);
            c7654bg2.m88200dS().incrementAndGet();
        }
    }

    /* renamed from: bg */
    public static void m88130bg(List<InterfaceC7706bg> list, String str) {
        try {
            InterfaceC7724zx m88153vb = C7659Kg.m88154iR().m88153vb();
            if (m88153vb == null || !m88153vb.mo83353iR() || list == null) {
                return;
            }
            for (InterfaceC7706bg interfaceC7706bg : list) {
                if (interfaceC7706bg != null) {
                    m88134bg(interfaceC7706bg, str, m88153vb);
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
