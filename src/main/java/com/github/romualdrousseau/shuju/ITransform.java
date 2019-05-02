package com.github.romualdrousseau.shuju;

import com.github.romualdrousseau.shuju.math.Vector;

public interface ITransform {
    public void apply(Vector feature, int rowIndex, int colIndex);
}
