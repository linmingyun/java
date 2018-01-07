package pattern03.abstractfactory;

import pattern02.factorymethod.common.Sender;

public interface Provider {
    public Sender produce();
}