package com.github.dylmeadows.eontimer.model;

import com.github.dylmeadows.eontimer.model.resource.SoundResource;
import javafx.scene.paint.Color;
import lombok.experimental.UtilityClass;

@UtilityClass
@SuppressWarnings({"unused", "WeakerAccess"})
public class ActionSettingsConstants {
    public final ActionMode DEFAULT_MODE = ActionMode.AUDIO;
    public final Color DEFAULT_COLOR = Color.CYAN;
    public final SoundResource DEFAULT_SOUND = SoundResource.BEEP;
    public final int DEFAULT_INTERVAL = 500;
    public final int DEFAULT_COUNT = 6;
}
