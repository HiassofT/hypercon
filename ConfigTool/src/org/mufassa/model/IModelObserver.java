package org.mufassa.model;

import java.util.Set;

public interface IModelObserver {
	public void modelUpdate(Set<ModelEvent> pEvents);
}