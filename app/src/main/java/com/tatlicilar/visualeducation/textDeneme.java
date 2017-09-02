package com.tatlicilar.visualeducation;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by Asus on 12.08.2017.
 */

public class textDeneme extends Activity{
    TextView lessonInformation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lesson_information);

        lessonInformation=(TextView) findViewById(R.id.lesson_infoTxt);
        lessonInformation.setMovementMethod(new ScrollingMovementMethod());
        lessonInformation.setText("işçsfdlhjarsezftdxgcyugjıköjkhgfcjkvlnhşmıjoömıhpngobyufdcstrexatcsvdjbfyugnmhıojöpkçöjımnyubvtcrxearcstvdubfyngoçpşköojmıhnugbyfvtdrsedawwasedrtfgyhujmhbvgfcsdxddfgh" +
                "jkmnbvcxzsedbcertyumknjbvdmjnuhbygvtfcrdxeswzaserdtfyghuıjokjmıhuygtfrdeswasexdrcfvghnjmkcszfvgbnhjmkölçşömkjhygtfredws<qswderftghyjukılkmunyvbtcgrx"
                );
    }

}
