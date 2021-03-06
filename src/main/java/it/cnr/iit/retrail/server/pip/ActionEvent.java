/*
 * CNR - IIT
 * Coded by: 2014 Enrico "KMcC;) Carniani
 */
package it.cnr.iit.retrail.server.pip;

import it.cnr.iit.retrail.commons.PepRequestInterface;
import it.cnr.iit.retrail.commons.PepSessionInterface;
import it.cnr.iit.retrail.server.behaviour.PDPAction;
import it.cnr.iit.retrail.server.behaviour.UConState;

/**
 *
 * @author oneadmin
 */
public class ActionEvent extends Event {

    public final PDPAction action;
    public final UConState originState;
    public final UConState targetState;

    public ActionEvent(PDPAction action, PepRequestInterface request, PepSessionInterface session) {
        super(request, session, null);
        this.action = action;
        this.originState = (UConState) action.getOriginState();
        this.targetState = (UConState) action.getTargetState();
    }
}
