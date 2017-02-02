package bhouse.travellist_starterproject;

import android.content.Context;

class Place {

  public String name;
  public String imageName;

  public int getImageResourceId(Context context) {
    return context.getResources().getIdentifier(this.imageName, "drawable", context.getPackageName());
  }
}
