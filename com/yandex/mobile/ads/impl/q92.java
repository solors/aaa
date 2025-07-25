package com.yandex.mobile.ads.impl;

import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class q92 implements InterfaceC30269et {
    @Nullable

    /* renamed from: a */
    private InterfaceC30269et f84263a;

    /* renamed from: a */
    public final void m30438a(@Nullable r92 r92Var) {
        this.f84263a = r92Var;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30269et
    public final void onVideoCompleted() {
        InterfaceC30269et interfaceC30269et = this.f84263a;
        if (interfaceC30269et != null) {
            interfaceC30269et.onVideoCompleted();
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30269et
    public final void onVideoError() {
        InterfaceC30269et interfaceC30269et = this.f84263a;
        if (interfaceC30269et != null) {
            interfaceC30269et.onVideoError();
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30269et
    public final void onVideoPaused() {
        InterfaceC30269et interfaceC30269et = this.f84263a;
        if (interfaceC30269et != null) {
            interfaceC30269et.onVideoPaused();
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30269et
    public final void onVideoPrepared() {
        InterfaceC30269et interfaceC30269et = this.f84263a;
        if (interfaceC30269et != null) {
            interfaceC30269et.onVideoPrepared();
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30269et
    public final void onVideoResumed() {
        InterfaceC30269et interfaceC30269et = this.f84263a;
        if (interfaceC30269et != null) {
            interfaceC30269et.onVideoResumed();
        }
    }
}
