/*
 * CNR - IIT
 * Coded by: 2014 Enrico "KMcC;) Carniani
 */

package it.cnr.iit.retrail.server.pip;

import it.cnr.iit.retrail.commons.PepAccessRequest;
import it.cnr.iit.retrail.commons.PepSession;

/**
 *
 * @author oneadmin
 */
public interface PIPInterface {

    String getUUID();

    void init();

    void onBeforeTryAccess(PepAccessRequest request);

    void onAfterTryAccess(PepAccessRequest request, PepSession session);

    void onBeforeStartAccess(PepAccessRequest request, PepSession session);

    void onAfterStartAccess(PepAccessRequest request, PepSession session);

    void onBeforeRevokeAccess(PepAccessRequest request, PepSession session);

    void onAfterRevokeAccess(PepAccessRequest request, PepSession session);

    void onBeforeEndAccess(PepAccessRequest request, PepSession session);

    void onAfterEndAccess(PepAccessRequest request, PepSession session);

    void refresh(PepAccessRequest accessRequest, PepSession session);

    void term();
    
}
