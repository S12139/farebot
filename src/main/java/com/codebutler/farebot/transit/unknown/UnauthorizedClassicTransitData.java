/*
 * UnauthorizedClassicTransitData.java
 *
 * This file is part of FareBot.
 * Learn more at: https://codebutler.github.io/farebot/
 *
 * Copyright (C) 2016 Eric Butler <eric@codebutler.com>
 * Copyright (C) 2016 Michael Farrell <micolous+git@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.codebutler.farebot.transit.unknown;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.codebutler.farebot.R;
import com.codebutler.farebot.transit.Refill;
import com.codebutler.farebot.transit.Subscription;
import com.codebutler.farebot.transit.TransitData;
import com.codebutler.farebot.transit.Trip;
import com.codebutler.farebot.ui.ListItem;
import com.codebutler.farebot.util.Utils;
import com.google.auto.value.AutoValue;

import java.util.List;

/**
 * Handle MiFare Classic with no open sectors
 */
@AutoValue
public abstract class UnauthorizedClassicTransitData extends TransitData {

    @NonNull
    public static UnauthorizedClassicTransitData create() {
        return new AutoValue_UnauthorizedClassicTransitData();
    }

    @NonNull
    @Override
    public String getBalanceString() {
        return null;
    }

    @NonNull
    @Override
    public String getSerialNumber() {
        return null;
    }

    @Nullable
    @Override
    public List<Trip> getTrips() {
        return null;
    }

    @Nullable
    @Override
    public List<Subscription> getSubscriptions() {
        return null;
    }

    @Nullable
    @Override
    public List<ListItem> getInfo() {
        return null;
    }

    @Nullable
    @Override
    public List<Refill> getRefills() {
        return null;
    }

    @NonNull
    @Override
    public String getCardName() {
        return Utils.localizeString(R.string.locked_card);
    }
}
