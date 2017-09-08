package Modules;

import java.util.List;

/**
 * Created by rahul on 8/9/17.
 */

public interface DirectionFinderListener {
    void onDirectionFinderStart();
    void onDirectionFinderSuccess(List<Route> route);
}
