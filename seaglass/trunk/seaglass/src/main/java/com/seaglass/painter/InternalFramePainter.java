/*
 * Copyright (c) 2009 Kathryn Huxtable and Kenneth Orr.
 *
 * This file is part of the SeaGlass Pluggable Look and Feel.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * $Id$
 */
package com.seaglass.painter;

/**
 */
public final class InternalFramePainter extends AbstractImagePainter {
    public static final int BACKGROUND_ENABLED               = 1;
    public static final int BACKGROUND_ENABLED_WINDOWFOCUSED = 2;

    public InternalFramePainter(PaintContext ctx, int state) {
        super(ctx, state);
    }

    protected String getImageName(int state) {
        switch (state) {
        case BACKGROUND_ENABLED:
            return "internal_frame_background_enabled";
        case BACKGROUND_ENABLED_WINDOWFOCUSED:
            return "internal_frame_background_focused";
        }
        return null;
    }
}