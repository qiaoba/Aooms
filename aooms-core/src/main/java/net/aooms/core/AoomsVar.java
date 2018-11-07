package net.aooms.core;

import org.springframework.http.ResponseEntity;

/**
 * DataKey Const
 * Created by 风象南(yuboon) on 2018-04-20
 */
public interface AoomsVar {

    String ID = "id";
    String ENCODE = "UTF-8";
    String TREE_ROOT = "ROOT";
    String ADMIN = "admin";
    String DEFAULT_DATASOURCE = "master";

    int YES_FOR_INT = 1;
    int NO_FOR_INT = -1;
    int YES_FOR_CHAR = 'Y';
    int NO_FOR_CHAR = 'N';

    String P_PAGE = "page";
    String P_LIMIT = "limit";

    String RS_META = "$";
    String RS_DATA = "$data";
    String RS_TREE = "$tree";
    String RS_TOTAL = "$total";
    String RS_VO = "$vo";
    String RS_Authentication = "$authentication";

    String IS_RENDER = "is_render";


}