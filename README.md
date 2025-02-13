# Documentação do Projeto - App de Sorteio

## Descrição
Este aplicativo simples gera um número aleatório de 0 a 10 quando o botão é pressionado. Ele foi inicialmente desenvolvido utilizando XML e `AppCompatActivity` e será migrado para Jetpack Compose em uma nova branch.

## Estrutura do Código (Branch Original - XML + View System)

### **MainActivity.kt**
- Extende `AppCompatActivity`.
- Usa `setContentView(R.layout.activity_main)` para definir a interface gráfica.
- Método `drawnNumber(view: View)` gera um número aleatório de 0 a 10 e exibe no `TextView result`.
- Utiliza `findViewById` para manipular os componentes da UI.

```kotlin
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun drawnNumber(view: View) {
        val resultText = findViewById<TextView>(R.id.result)
        val number = Random().nextInt(11)
        resultText.text = "$number"
    }
}
```

### **activity_main.xml**
- Usa `ConstraintLayout` para organizar os elementos na tela.
- Contém um `TextView` de título, um `Button` para sortear um número e um `TextView` para exibir o resultado.
- O botão chama `drawnNumber` via `android:onClick`.

```xml
<Button
    android:id="@+id/btn"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:onClick="drawnNumber"
    android:text="Sortear Número" />
```

## Próximos Passos
A próxima versão do projeto será migrada para **Jetpack Compose**, eliminando a necessidade de XML e `findViewById`, utilizando um código mais declarativo e eficiente.

Branch nova: `feature/jetpack-compose`.

---

Para mais detalhes sobre a versão em Compose, veja a documentação específica dessa branch.

