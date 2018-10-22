import React, { Component } from 'react';
import './App.css';
import Grid from './Grid'
import { Header } from 'semantic-ui-react'

class App extends Component {
  render() {
    return (
      <div className="App">
      <Header
        as='h2'
        content='Estabelecimentos de saúde'
        subheader='Relação dos estabelecimentos de saúde registrados no Brasil'
        />
        <Grid />
      </div>
    );
  }
}

export default App;