package com.vkochenkov.weatherfromopenapis.entities;

import android.view.View;

public interface CityClickListener {
    View.OnClickListener onCityClickListener(City city);

    View.OnLongClickListener onCityLongClickListener(int position, City city);
}
