import React, { Component } from 'react';
import './App.css';
import estabelecimentos from './estabelecimentos.json';
import Map from './GMap';
import { Input, Label } from 'semantic-ui-react';

class Grid extends Component {

  state = {
    index: 10,
    filtro: "",
    local: { lat: 0, lng: 0 },
  };


  handleScroll = (e) => {
    let bottom = e.target.scrollHeight - e.target.scrollTop === e.target.clientHeight;
    if (bottom) {
      this.setState({ index: this.state.index + 10, });
    }
  };

  filtro = (e) => {
    this.setState({ filtro: e.target.value.toUpperCase() });
  };

  render() {
    let renderiza = this.state.filtro !== ""
      ? estabelecimentos.filter(x => x.codigoCNES.startsWith(this.state.filtro) || x.razaoSocial.startsWith(this.state.filtro)).slice(0, this.state.index)
      : estabelecimentos.slice(0, this.state.index)
    return (
      <div className='gridContainer'>
        <div className='tabela'>
          <Input style={{ paddingBottom: 10 }} placeholder='Digite algo para buscar' onKeyUp={this.filtro} />
          <table className="tg">
            <thead>
              <tr>
                <th>CNES</th>
                <th>Razão social</th>
              </tr>
            </thead>
            <tbody onScroll={this.handleScroll}>
              {
                renderiza.map(estabelecimento => (
                  <tr
                    key={estabelecimento.codigoCNES}
                    onClick={() => this.setState({ local: { lat: estabelecimento.latitude, lng: estabelecimento.longitude } })}>
                    <td>{estabelecimento.codigoCNES}</td>
                    <td>{estabelecimento.razaoSocial}</td>
                  </tr>
                ))
              }
            </tbody>
          </table>
        </div>
        <div className='Mapa'>
          {
            this.state.local.lat && this.state.local.lng
              ? (<Map local={this.state.local} />)
              : (
                <Label color='red' key='Alerta' size='big'>
                  ERRO: Não foi possível localizar esse estabelecimento.
                </Label>
              )
          }
        </div>
      </div>
    );
  }
}

export default Grid;