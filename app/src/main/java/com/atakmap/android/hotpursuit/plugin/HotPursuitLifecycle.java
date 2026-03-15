
package com.atakmap.android.hotpursuit.plugin;

import com.atak.plugins.impl.AbstractPlugin;
import com.atak.plugins.impl.PluginContextProvider;
import gov.tak.api.plugin.IServiceController;
import com.atakmap.android.hotpursuit.HotPursuitMapComponent;

public class HotPursuitLifecycle extends AbstractPlugin {

    public HotPursuitLifecycle(IServiceController serviceController) {
        super(serviceController, new HotPursuitTool(serviceController.getService(PluginContextProvider.class).getPluginContext()), new HotPursuitMapComponent());
    }
}
