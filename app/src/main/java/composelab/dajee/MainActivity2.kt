package composelab.dajee

import android.app.PendingIntent
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.TaskStackBuilder
import androidx.core.net.toUri
import composelab.dajee.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {


    private var _binding:ActivityMain2Binding? = null
    private val binding get() =  _binding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toDajeeCompose.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java).apply {
            }
            startActivity(intent)
            finish()
        }

        binding.toDajeeComposeFeature2.setOnClickListener {
            //val id = "exampleId"
            val deepLinkIntent = Intent(
                Intent.ACTION_VIEW,
                "dajee://example.com".toUri(),
                applicationContext,
                MainActivity::class.java
            )

            val deepLinkPendingIntent: PendingIntent? = TaskStackBuilder.create(this).run {
                addNextIntentWithParentStack(deepLinkIntent)
                getPendingIntent(0,PendingIntent.FLAG_UPDATE_CURRENT)
            }

            deepLinkPendingIntent?.send(0)
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}