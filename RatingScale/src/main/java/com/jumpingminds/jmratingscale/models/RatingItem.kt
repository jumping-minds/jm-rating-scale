package com.jumpingminds.jmratingscale.models

import androidx.annotation.DrawableRes

data class RatingItem(
  val id: Int,
  @DrawableRes val unselectedDrawable: Int,
  @DrawableRes val selectedDrawable: Int
)
