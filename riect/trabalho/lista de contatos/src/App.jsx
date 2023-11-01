import './App.css'

function App() {

  return (
    <div className={styles.container}>
      <form className={styles.from}>
        <h1>Formulário de cadastro</h1>
        <input type="text" placeholder="Nome completo" required />
        <input type="text" placeholder="E-mail" required />
        <input type="text" placeholder="Senha" required />
        <button type="submitg">Enviar</button>
      </form>
    </div>
  )
}

export default App
