package mediaorganizer.Utility;

import javafx.collections.ObservableList;
import mediaorganizer.MediaOrganizerDataModel;

import java.util.HashMap;

//class used for loading datamaps from disk.
public class SetMediaOrganizerDataModelMap {
    public HashMap<Integer, MediaOrganizerDataModel> setMediaOrganizerDataModelMap(
                  HashMap<Integer, MediaOrganizerDataModel> initialMediaOrganizerDataModelMap,
                  HashMap<Integer, MediaOrganizerDataModel> mediaOrganizerDataModelMap,
                  ObservableList<MediaOrganizerDataModel> resultSet, int resultSetID) {

        mediaOrganizerDataModelMap.clear();
        resultSet.clear();
        mediaOrganizerDataModelMap.putAll(initialMediaOrganizerDataModelMap);
        resultSet.addAll(initialMediaOrganizerDataModelMap.values());

        if (resultSetID != 0)
            resultSetID = mediaOrganizerDataModelMap.keySet().stream().max(Integer::compare).get();

        return initialMediaOrganizerDataModelMap;
    }
}
