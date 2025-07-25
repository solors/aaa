package androidx.compose.foundation.text;

import androidx.compose.p015ui.input.key.Key;
import androidx.compose.p015ui.input.key.KeyEvent;
import androidx.compose.p015ui.input.key.KeyEvent_androidKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: KeyMapping.kt */
@Metadata
/* loaded from: classes.dex */
public final class KeyMappingKt {
    @NotNull
    private static final KeyMapping defaultKeyMapping;

    static {
        final KeyMapping commonKeyMapping = commonKeyMapping(new PropertyReference1Impl() { // from class: androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            @Nullable
            public Object get(@Nullable Object obj) {
                return Boolean.valueOf(KeyEvent_androidKt.m108765isCtrlPressedZmokQxo(((KeyEvent) obj).m108750unboximpl()));
            }
        });
        defaultKeyMapping = new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$2$1
            @Override // androidx.compose.foundation.text.KeyMapping
            @Nullable
            /* renamed from: map-ZmokQxo */
            public KeyCommand mo106595mapZmokQxo(@NotNull android.view.KeyEvent event) {
                Intrinsics.checkNotNullParameter(event, "event");
                KeyCommand keyCommand = null;
                if (KeyEvent_androidKt.m108767isShiftPressedZmokQxo(event) && KeyEvent_androidKt.m108765isCtrlPressedZmokQxo(event)) {
                    long m108761getKeyZmokQxo = KeyEvent_androidKt.m108761getKeyZmokQxo(event);
                    MappedKeys mappedKeys = MappedKeys.INSTANCE;
                    if (Key.m108166equalsimpl0(m108761getKeyZmokQxo, mappedKeys.m106614getDirectionLeftEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LEFT_WORD;
                    } else if (Key.m108166equalsimpl0(m108761getKeyZmokQxo, mappedKeys.m106615getDirectionRightEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_RIGHT_WORD;
                    } else if (Key.m108166equalsimpl0(m108761getKeyZmokQxo, mappedKeys.m106616getDirectionUpEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_PREV_PARAGRAPH;
                    } else if (Key.m108166equalsimpl0(m108761getKeyZmokQxo, mappedKeys.m106613getDirectionDownEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_NEXT_PARAGRAPH;
                    }
                } else if (KeyEvent_androidKt.m108765isCtrlPressedZmokQxo(event)) {
                    long m108761getKeyZmokQxo2 = KeyEvent_androidKt.m108761getKeyZmokQxo(event);
                    MappedKeys mappedKeys2 = MappedKeys.INSTANCE;
                    if (Key.m108166equalsimpl0(m108761getKeyZmokQxo2, mappedKeys2.m106614getDirectionLeftEK5gGoQ())) {
                        keyCommand = KeyCommand.LEFT_WORD;
                    } else if (Key.m108166equalsimpl0(m108761getKeyZmokQxo2, mappedKeys2.m106615getDirectionRightEK5gGoQ())) {
                        keyCommand = KeyCommand.RIGHT_WORD;
                    } else if (Key.m108166equalsimpl0(m108761getKeyZmokQxo2, mappedKeys2.m106616getDirectionUpEK5gGoQ())) {
                        keyCommand = KeyCommand.PREV_PARAGRAPH;
                    } else if (Key.m108166equalsimpl0(m108761getKeyZmokQxo2, mappedKeys2.m106613getDirectionDownEK5gGoQ())) {
                        keyCommand = KeyCommand.NEXT_PARAGRAPH;
                    } else if (Key.m108166equalsimpl0(m108761getKeyZmokQxo2, mappedKeys2.m106618getHEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_PREV_CHAR;
                    } else if (Key.m108166equalsimpl0(m108761getKeyZmokQxo2, mappedKeys2.m106612getDeleteEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_NEXT_WORD;
                    } else if (Key.m108166equalsimpl0(m108761getKeyZmokQxo2, mappedKeys2.m106609getBackspaceEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_PREV_WORD;
                    } else if (Key.m108166equalsimpl0(m108761getKeyZmokQxo2, mappedKeys2.m106608getBackslashEK5gGoQ())) {
                        keyCommand = KeyCommand.DESELECT;
                    }
                } else if (KeyEvent_androidKt.m108767isShiftPressedZmokQxo(event)) {
                    long m108761getKeyZmokQxo3 = KeyEvent_androidKt.m108761getKeyZmokQxo(event);
                    MappedKeys mappedKeys3 = MappedKeys.INSTANCE;
                    if (Key.m108166equalsimpl0(m108761getKeyZmokQxo3, mappedKeys3.m106621getMoveHomeEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_HOME;
                    } else if (Key.m108166equalsimpl0(m108761getKeyZmokQxo3, mappedKeys3.m106620getMoveEndEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_END;
                    }
                }
                if (keyCommand == null) {
                    return KeyMapping.this.mo106595mapZmokQxo(event);
                }
                return keyCommand;
            }
        };
    }

    @NotNull
    public static final KeyMapping commonKeyMapping(@NotNull final Function1<? super KeyEvent, Boolean> shortcutModifier) {
        Intrinsics.checkNotNullParameter(shortcutModifier, "shortcutModifier");
        return new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt$commonKeyMapping$1
            @Override // androidx.compose.foundation.text.KeyMapping
            @Nullable
            /* renamed from: map-ZmokQxo */
            public KeyCommand mo106595mapZmokQxo(@NotNull android.view.KeyEvent event) {
                boolean m108166equalsimpl0;
                Intrinsics.checkNotNullParameter(event, "event");
                if (shortcutModifier.invoke(KeyEvent.m108744boximpl(event)).booleanValue() && KeyEvent_androidKt.m108767isShiftPressedZmokQxo(event)) {
                    if (!Key.m108166equalsimpl0(KeyEvent_androidKt.m108761getKeyZmokQxo(event), MappedKeys.INSTANCE.m106628getZEK5gGoQ())) {
                        return null;
                    }
                    return KeyCommand.REDO;
                } else if (shortcutModifier.invoke(KeyEvent.m108744boximpl(event)).booleanValue()) {
                    long m108761getKeyZmokQxo = KeyEvent_androidKt.m108761getKeyZmokQxo(event);
                    MappedKeys mappedKeys = MappedKeys.INSTANCE;
                    if (Key.m108166equalsimpl0(m108761getKeyZmokQxo, mappedKeys.m106610getCEK5gGoQ())) {
                        m108166equalsimpl0 = true;
                    } else {
                        m108166equalsimpl0 = Key.m108166equalsimpl0(m108761getKeyZmokQxo, mappedKeys.m106619getInsertEK5gGoQ());
                    }
                    if (m108166equalsimpl0) {
                        return KeyCommand.COPY;
                    }
                    if (Key.m108166equalsimpl0(m108761getKeyZmokQxo, mappedKeys.m106626getVEK5gGoQ())) {
                        return KeyCommand.PASTE;
                    }
                    if (Key.m108166equalsimpl0(m108761getKeyZmokQxo, mappedKeys.m106627getXEK5gGoQ())) {
                        return KeyCommand.CUT;
                    }
                    if (Key.m108166equalsimpl0(m108761getKeyZmokQxo, mappedKeys.m106607getAEK5gGoQ())) {
                        return KeyCommand.SELECT_ALL;
                    }
                    if (!Key.m108166equalsimpl0(m108761getKeyZmokQxo, mappedKeys.m106628getZEK5gGoQ())) {
                        return null;
                    }
                    return KeyCommand.UNDO;
                } else if (KeyEvent_androidKt.m108765isCtrlPressedZmokQxo(event)) {
                    return null;
                } else {
                    if (KeyEvent_androidKt.m108767isShiftPressedZmokQxo(event)) {
                        long m108761getKeyZmokQxo2 = KeyEvent_androidKt.m108761getKeyZmokQxo(event);
                        MappedKeys mappedKeys2 = MappedKeys.INSTANCE;
                        if (Key.m108166equalsimpl0(m108761getKeyZmokQxo2, mappedKeys2.m106614getDirectionLeftEK5gGoQ())) {
                            return KeyCommand.SELECT_LEFT_CHAR;
                        }
                        if (Key.m108166equalsimpl0(m108761getKeyZmokQxo2, mappedKeys2.m106615getDirectionRightEK5gGoQ())) {
                            return KeyCommand.SELECT_RIGHT_CHAR;
                        }
                        if (Key.m108166equalsimpl0(m108761getKeyZmokQxo2, mappedKeys2.m106616getDirectionUpEK5gGoQ())) {
                            return KeyCommand.SELECT_UP;
                        }
                        if (Key.m108166equalsimpl0(m108761getKeyZmokQxo2, mappedKeys2.m106613getDirectionDownEK5gGoQ())) {
                            return KeyCommand.SELECT_DOWN;
                        }
                        if (Key.m108166equalsimpl0(m108761getKeyZmokQxo2, mappedKeys2.m106623getPageUpEK5gGoQ())) {
                            return KeyCommand.SELECT_PAGE_UP;
                        }
                        if (Key.m108166equalsimpl0(m108761getKeyZmokQxo2, mappedKeys2.m106622getPageDownEK5gGoQ())) {
                            return KeyCommand.SELECT_PAGE_DOWN;
                        }
                        if (Key.m108166equalsimpl0(m108761getKeyZmokQxo2, mappedKeys2.m106621getMoveHomeEK5gGoQ())) {
                            return KeyCommand.SELECT_LINE_START;
                        }
                        if (Key.m108166equalsimpl0(m108761getKeyZmokQxo2, mappedKeys2.m106620getMoveEndEK5gGoQ())) {
                            return KeyCommand.SELECT_LINE_END;
                        }
                        if (!Key.m108166equalsimpl0(m108761getKeyZmokQxo2, mappedKeys2.m106619getInsertEK5gGoQ())) {
                            return null;
                        }
                        return KeyCommand.PASTE;
                    }
                    long m108761getKeyZmokQxo3 = KeyEvent_androidKt.m108761getKeyZmokQxo(event);
                    MappedKeys mappedKeys3 = MappedKeys.INSTANCE;
                    if (Key.m108166equalsimpl0(m108761getKeyZmokQxo3, mappedKeys3.m106614getDirectionLeftEK5gGoQ())) {
                        return KeyCommand.LEFT_CHAR;
                    }
                    if (Key.m108166equalsimpl0(m108761getKeyZmokQxo3, mappedKeys3.m106615getDirectionRightEK5gGoQ())) {
                        return KeyCommand.RIGHT_CHAR;
                    }
                    if (Key.m108166equalsimpl0(m108761getKeyZmokQxo3, mappedKeys3.m106616getDirectionUpEK5gGoQ())) {
                        return KeyCommand.UP;
                    }
                    if (Key.m108166equalsimpl0(m108761getKeyZmokQxo3, mappedKeys3.m106613getDirectionDownEK5gGoQ())) {
                        return KeyCommand.DOWN;
                    }
                    if (Key.m108166equalsimpl0(m108761getKeyZmokQxo3, mappedKeys3.m106623getPageUpEK5gGoQ())) {
                        return KeyCommand.PAGE_UP;
                    }
                    if (Key.m108166equalsimpl0(m108761getKeyZmokQxo3, mappedKeys3.m106622getPageDownEK5gGoQ())) {
                        return KeyCommand.PAGE_DOWN;
                    }
                    if (Key.m108166equalsimpl0(m108761getKeyZmokQxo3, mappedKeys3.m106621getMoveHomeEK5gGoQ())) {
                        return KeyCommand.LINE_START;
                    }
                    if (Key.m108166equalsimpl0(m108761getKeyZmokQxo3, mappedKeys3.m106620getMoveEndEK5gGoQ())) {
                        return KeyCommand.LINE_END;
                    }
                    if (Key.m108166equalsimpl0(m108761getKeyZmokQxo3, mappedKeys3.m106617getEnterEK5gGoQ())) {
                        return KeyCommand.NEW_LINE;
                    }
                    if (Key.m108166equalsimpl0(m108761getKeyZmokQxo3, mappedKeys3.m106609getBackspaceEK5gGoQ())) {
                        return KeyCommand.DELETE_PREV_CHAR;
                    }
                    if (Key.m108166equalsimpl0(m108761getKeyZmokQxo3, mappedKeys3.m106612getDeleteEK5gGoQ())) {
                        return KeyCommand.DELETE_NEXT_CHAR;
                    }
                    if (Key.m108166equalsimpl0(m108761getKeyZmokQxo3, mappedKeys3.m106624getPasteEK5gGoQ())) {
                        return KeyCommand.PASTE;
                    }
                    if (Key.m108166equalsimpl0(m108761getKeyZmokQxo3, mappedKeys3.m106611getCutEK5gGoQ())) {
                        return KeyCommand.CUT;
                    }
                    if (!Key.m108166equalsimpl0(m108761getKeyZmokQxo3, mappedKeys3.m106625getTabEK5gGoQ())) {
                        return null;
                    }
                    return KeyCommand.TAB;
                }
            }
        };
    }

    @NotNull
    public static final KeyMapping getDefaultKeyMapping() {
        return defaultKeyMapping;
    }
}
