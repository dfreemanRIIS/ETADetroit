package dfreemanRIIS.ETADetroit;

import android.content.Context;

class BusCompany {

  public String name;
  public String imageName;

  public int getImageResourceId(Context context) {
    return context.getResources().getIdentifier(this.imageName, "drawable", context.getPackageName());
  }
}
