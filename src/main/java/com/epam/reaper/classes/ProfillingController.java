package com.epam.reaper.classes;

import com.epam.reaper.interfaces.ProfilingControllerBean;

public class ProfillingController implements ProfilingControllerBean {
    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    private boolean enabled;
}


